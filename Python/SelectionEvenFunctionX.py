# Procedural approach

def checkeven(No):
    if(No%2==0):
        print("It is even")
    else:
        print("It is odd")


def main():         #(user interaction should be with main)
    value=0

    value = int(input("Enter the number: "))

    checkeven(value)


if (__name__=="__main__"):
    main()

    
