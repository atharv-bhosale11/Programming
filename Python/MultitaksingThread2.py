import threading

def display():
    print("Inside Display function",threading.get_ident())


def main():
    print("Inside main",threading.get_ident())
    t = threading.Thread(target=display)
    t.start()
    print("End of Main")

if __name__ == "__main__":
    main()
