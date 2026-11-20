def count_words(filename):

    try:
        with open(filename, "r") as file:
            data = file.read()

        words = data.lower().split()

        word_count = {}

        for word in words:
            word_count[word] = word_count.get(word, 0) + 1

        for word, count in word_count.items():
            print(word, ":", count)

    except FileNotFoundError:
        print("File does not exist.")


count_words("sample.txt")
