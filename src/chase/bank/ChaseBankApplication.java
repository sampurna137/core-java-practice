package chase.bank;

public class ChaseBankApplication {

    public static void main(String[] args) {

        Menu businessMenu = new Menu();
        businessMenu.menuId = 1;
        businessMenu.name = "Business";
        businessMenu.slug = "";
        businessMenu.isExternal = false;
        businessMenu.externalURL = "";
        businessMenu.isActive = true;
        businessMenu.parentId = 0;
        businessMenu.isLeaf = true;

    }

}
