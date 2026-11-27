def find_missing(numbers, n):

    expected_sum = n * (n + 1) // 2

    actual_sum = 0

    for num in numbers:
        actual_sum += num

    missing = expected_sum - actual_sum

    print("Missing Number:", missing)


numbers = [1, 2, 3, 5, 6, 7, 8]
n = 8

find_missing(numbers, n)
