def chatbot():
    print("Hello! I'm a simple chatbot. How can I assist you today?")
    while True:
        user_input = input("You: ").lower()  # Take user input and convert it to lowercase

        
        if user_input == "hello" or user_input == "hi":
            print("Chatbot: Hi there!")
        elif user_input == "how are you?":
            print("Chatbot: I'm just a bot, but thanks for asking!")
        elif user_input == "quit" or user_input == "bye":
            print("Chatbot: Goodbye! Have a great day!")
            break  
        else:
            print("Chatbot: I'm sorry, I didn't understand that.")


chatbot()