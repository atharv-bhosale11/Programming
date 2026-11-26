def second_most_frequent(filename):

    try:
        with open(filename, "r") as file:
            data = file.read()

        words = data.lower().split()

        word_count = {}

        for word in words:
            word_count[word] = word_count.get(word, 0) + 1

        sorted_words = sorted(
            word_count.items(),
            key=lambda item: item[1],
            reverse=True
        )

        if len(sorted_words) < 2:
            print("Second most frequent word does not exist.")
        else:
            print("Second Most Frequent Word:", sorted_words[1][0])
            print("Frequency:", sorted_words[1][1])

second_most_frequent("sample.txt")
