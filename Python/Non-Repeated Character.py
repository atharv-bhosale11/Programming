def first_non_repeated_char(text):
    frequency = {}
 
    for char in text:
        frequency[char] = frequency.get(char, 0) + 1

    for char in text:
        if frequency[char] == 1:
            return char

    return None


string = input("Enter a string: ")

result = first_non_repeated_char(string)

if result:
    print("First non-repeated character:", result)
else:
    print("No unique character found")
