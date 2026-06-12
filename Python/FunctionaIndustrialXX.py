# Procedural approach

def checkeven(No):
    return(No%2==0)

def main():         #(user interaction should be with main)
    value=0
    Ret = False     #(ret i.e. result) 
    value = int(input("Enter the number: "))

    Ret= checkeven(value)

    if(Ret == True):
        print("It is even")
    else:
        print("It is odd")

if (__name__=="__main__"):
    main()

    
