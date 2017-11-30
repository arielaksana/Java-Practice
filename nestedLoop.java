/*
Write nested for loops that produce the following output:

0001112223333444555666777888999
0001112223333444555666777888999
0001112223333444555666777888999
*/

for(int i=0;i<3;i++) {
        for(int j=0;j<=9;j++) {
            for(int x=0;x<3;x++) {
                System.out.print(j);
            }
        }System.out.println();
}
