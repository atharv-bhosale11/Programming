#include<stdio.h>
#include<fcntl.h>      // Only Linux based 
#include<unistd.h>  

int main()
{
    int fd = 0;             // File Descriptior

    fd = open("ABC.txt",O_RDWR);

    if(fd == -1)
    {
        printf("Unable to Open File\n");
    }
    else
    {
        printf("File Gets Succesfully Open with fd : %d\n",fd);

        write(fd,"Jay Ganesh!!!!!!!",17);

        close(fd);
    }
    return 0;
}
