# Procedural approach

def checkeven(No):
    if(No%2==0):
        return True
    else:
        return False

def main():         #(user interaction should be with main)
    value=0
    Ret = False
    value = int(input("Enter the number: "))

    Ret= checkeven(value)

    print(Ret)

if (__name__=="__main__"):
    main()

    
