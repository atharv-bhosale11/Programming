def reverse_file(filename):

    try:
        with open(filename, "r") as file:
            lines = file.readlines()

        for line in reversed(lines):
            print(line, end="")

    except FileNotFoundError:
        print("File does not exist.")


reverse_file("sample.txt")
