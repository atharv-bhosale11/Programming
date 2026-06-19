class Arithematic:
    def Addition(self,A,B):  #Instance Method due to self keyword
        return A+B

    def Substraction(self,A,B):  #Instance Method due to self keyword
        return A-B

No1 = 0
No2 = 0
Ans = 0

No1=int(input("Enter the First number: "))
No2=int(input("Enter the Second number: "))

obj=Arithematic()

Ans = obj.Addition(No1,No2)
print("Addition is: ",Ans)

Ans = obj.Substraction(No1,No2)
print("Substraction is: ",Ans)
