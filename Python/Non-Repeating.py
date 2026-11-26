from collections import Counter

def first_non_repeating(numbers):

    frequency = Counter(numbers)

    result = next
    (
        filter(lambda x: frequency[x] == 1, numbers),
        None
    )

    if result is not None:
        print("First Non-Repeating Element:", result)
    else:
        print("No Non-Repeating Element Found.")


numbers = [4, 5, 1, 2, 0, 4, 1, 2]

first_non_repeating(numbers)
 
