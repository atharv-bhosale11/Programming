def display(A,B,C,D):
    print(A,B,C,D)


def main():
    #display(10,20)  Not allowed due to less arguments than 4
    #display(10,20,30,40,50)  Not allowed due to more arguments than 4
    display(10,20,30,40)  #Allowed

if __name__ == "__main__":
    main()
