def second_largest(numbers):

    largest = float('-inf')
    second = float('-inf')

    for num in numbers:

        if num > largest:
            second = largest
            largest = num

        elif num > second and num != largest:
            second = num

    if second == float('inf'):
        print("Second Largest Element Does Not Exist.")
    else:
        print("Second Largest Element:", second)


numbers = [10, 25, 45, 30, 45, 15, 40]

second_largest(numbers)
