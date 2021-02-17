# Python hello world
class Message:
    text = ''

    def __init__(self, msg):
        self.text = msg

    def __str__(self):
        return self.text

myMessage = Message('Hello, Python world')
print(myMessage)