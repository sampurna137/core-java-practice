package chase.bank;

public class ChaseBankApplication {

    public static void main(String[] args) {

        Language english = new Language();
        english.setLangId(1);
        english.setLangName("English");

        Language spanish = new Language();
        spanish.setLangId(2);
        spanish.setLangName("Spanish");

        Language german = new Language();
        german.setLangId(3);
        german.setLangName("German");


        Menu businessMenu = new Menu();
        businessMenu.setMenuId(1);
        businessMenu.setName("Business");
        businessMenu.setSlug ("");
        businessMenu.setExternal(false);
        businessMenu.setExternalURL("");
        businessMenu.setActive(true);
        businessMenu.setParentId(0);
        businessMenu.setLeaf(false);
        businessMenu.setLangId(english.getLangId());

        Menu businessMenu_ger = new Menu();
        businessMenu_ger.setMenuId(9);
        businessMenu_ger.setName("Geschaft");
        businessMenu_ger.setSlug ("");
        businessMenu_ger.setExternal(false);
        businessMenu_ger.setExternalURL("");
        businessMenu_ger.setActive(true);
        businessMenu_ger.setParentId(0);
        businessMenu_ger.setLeaf(false);
        businessMenu_ger.setLangId(german.getLangId());

        Menu bankingSolutions = new Menu();
        businessMenu.setMenuId(2);
        businessMenu.setName("Banking Solutions");
        businessMenu.setSlug("");
        businessMenu.setExternal(false);
        businessMenu.setExternalURL("");
        businessMenu.setActive(true);
        businessMenu.setParentId(1);
        businessMenu.setLeaf(true);
        businessMenu.setLangId(english.getLangId());

        Menu bankingSolutionsChild = new Menu();
        bankingSolutionsChild.setMenuId(3);
        bankingSolutionsChild.setName("Banking Solutions");
        bankingSolutionsChild.setSlug("banking-solutions");
        bankingSolutionsChild.setExternal(false);
        bankingSolutionsChild.setExternalURL("");
        bankingSolutionsChild.setActive(true);
        bankingSolutionsChild.setParentId(2);
        bankingSolutionsChild.setLeaf(true);
        bankingSolutions.setLangId(english.getLangId());

        Menu checking = new Menu();
        checking.setMenuId(4);
        checking.setName("Checking");
        checking.setSlug("checking");
        checking.setExternal(false);
        checking.setExternalURL("");
        checking.setActive(true);
        checking.setParentId(2);
        checking.setLeaf(true);
        checking.setLangId(english.getLangId());

        Menu savings = new Menu();
        savings.setMenuId(5);
        savings.setName("Savings");
        savings.setSlug("savings");
        savings.setExternal(false);
        savings.setExternalURL("");
        savings.setActive(true);
        savings.setParentId(2);
        savings.setLeaf(true);
        savings.setLangId(english.getLangId());

        Menu loans = new Menu();
        loans.setMenuId(6);
        loans.setName("Loans and Financing");
        loans.setSlug("loans");
        loans.setExternal(false);
        loans.setExternalURL("");
        loans.setActive(true);
        loans.setParentId(2);
        loans.setLeaf(true);
        loans.setLangId(english.getLangId());

        Menu retirement = new Menu();
        retirement.setMenuId(7);
        retirement.setName("Retirement");
        retirement.setSlug("retirement");
        retirement.setExternal(false);
        retirement.setExternalURL("");
        retirement.setActive(true);
        retirement.setParentId(2);
        retirement.setLeaf(true);
        retirement.setLangId(english.getLangId());

        Menu services = new Menu();
        services.setMenuId(8);
        services.setName("Business Services");
        services.setSlug("services");
        services.setExternal(false);
        services.setExternalURL("");
        services.setActive(true);
        services.setParentId(2);
        services.setLeaf(true);
        services.setLangId(english.getLangId());

    }

}
