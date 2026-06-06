class Arithmatic:
    def __init__(self,A,B):
        self.NO1 = A
        self.NO2 = B
        print("Object gets created Successfully")

    def Addition(self):
        Ans=0
        Ans = self.NO1 + self.NO2
        return Ans
    
    def Substraction(self):
        Ans=0
        Ans = self.NO1 - self.NO2
        return Ans
     
obj1 = Arithmatic(11,10)  #Arithmatic(id(obj1),11,10)
obj2 = Arithmatic(21,20)  #Arithmatic(id(obj1),21,20)

Ret = obj1.Addition()
print(Ret) #21
Ret = obj2.Substraction()
print(Ret) #1