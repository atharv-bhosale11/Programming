import os

def split_file(filename, lines_per_file):

    with open(filename, "r") as file:
        lines = file.readlines()

    file_count = 1

    for i in range(0, len(lines), lines_per_file):

        new_filename = f"part{file_count}.txt"

        with open(new_filename, "w") as file:
            file.writelines(lines[i:i + lines_per_file])

        print(f"{new_filename} created successfully.")

        file_count += 1


filename = "sample.txt"

lines_per_file = 3

if os.path.exists(filename):
    split_file(filename, lines_per_file)
else:
    print("File does not exist.")
