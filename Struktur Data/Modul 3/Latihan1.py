class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[-1]

    def is_empty(self):
        return len(self.items) == 0

    def search(self, item):
        try:
            idx = len(self.items) - self.items[::-1].index(item) - 1
            return len(self.items) - idx
        except ValueError:
            return -1


st = Stack()
st.push("Aku")
st.push("Anak")
st.push("Indonesia")
st.push("Cinta")
st.push("Tanah")
st.push("Air")


print("Next : ", st.peek())
st.push("Raya")
print(st.pop())
st.push("!")

count = st.search("Cinta")
while count != -1 and count > 1:
    st.pop()
    count -= 1
print(st.pop())
print(st.is_empty())
count = st.search("Aku")
while count != -1 and count > 1:
    st.pop()
    count -= 1
print(st.pop())
print(st.is_empty())
