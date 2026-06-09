class Parent:
    def __init__(self):
        print("Inside Parent Constructor")

    def fun(self):
        print("Inside Fun Method of Parent")
    
class Child(Parent):
    def __init__(self):
        super().__init__()
        print("Inside Child Constructor")
      
    def fun(self):
        super().fun()
        print("Inside fun Method of Child")

cobj=Child()

cobj.fun()