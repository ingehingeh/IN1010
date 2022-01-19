// 01.12 Python til Java; Areal av rektangel

/* Python kode som skal oversettes til Java
bredde = 10
hoyde = 20
print("Bredde:", bredde)
print("Høyde:", hoyde)

areal = bredde * hoyde
print("Areal:", areal)*/

class ArealRektangel{
    public static void main(String[] args) {
        int bredde = 10;
        int hoyde = 20;
        System.out.println("Bredde: " + bredde);
        System.out.println("Høyde: " + hoyde);

        int areal = bredde * hoyde;
        System.out.println("Areal: " + areal);
    }
}