# Functional approach

def checkeven(No):
    if(No%2==0):
        print("It is even")
    else:
        print("It is odd")


def main():         #(user interaction should be with main)
    checkeven(22)       #Positional
    checkeven(No=22)    #Keyword
  
if (__name__=="__main__"):
    main()

    
