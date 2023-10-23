import java.io.*;
import java.net.*;
import java.util.Scanner;

public class StockVitalBoutique
{
    Scanner scan =  new Scanner(System.in);

    // Declaration des attributs
    private String nomProduit;
    private int quantiteProduit, prixUnitaireProduit;
    static int incrementationNombreTotalProduitsEnStock=0;
    static String [] listeProduit = new String[100];

    // creation du constructeur sans parametres
    public StockVitalBoutique()
    {
        System.out.print("Nom du produit : ");
        String nom = scan.nextLine();
        this.nomProduit = nom;
        System.out.print("Quantite du produit : ");
        int qte = scan.nextInt();
        this.quantiteProduit = qte;
        System.out.print("Prix unitaire : ");
        int pu = scan.nextInt();
        this.prixUnitaireProduit = pu;
        System.out.println("\t\t\t\t-------------**********--------------\n"+
                            "\t\t\t\t\tstock de "+nom+" creé avec succes\n"+
                            "\t\t\t\t-------------**********--------------\n");
        incrementationNombreTotalProduitsEnStock++;
        listeProduit[incrementationNombreTotalProduitsEnStock-1] = nom;
    }

    //creation d'une methode assurant l'option: liste des produits en stock
    public void liste_de_tous_les_produits_en_Stock()
    {
        //System.out.print(p.incrementationNombreTotalProduitsEnStock);
        System.out.println("\n\t\tProduits en Stock");
        for(int j=0; j<incrementationNombreTotalProduitsEnStock; j++)
        {
            System.out.println(j+1 +"- " + listeProduit[j]);
        }
    }

    //creation d'une methode assurant l'approvisionnement
    public void setApprovisionnement()
    {
        System.out.println("\n\t\tEntrer la quantite a ajouter :");
        int quantite = scan.nextInt();
        this.quantiteProduit += quantite;
        System.out.println("\t\t\t\t------------------**************--------------------\n"+
                            "\t\t\t\t\tAPPROVISIONNEMENT EFFECTUER AVEC SUCCES\n"+
                            "\t\t\t\t-----------------**************----------------------");
        System.out.print("Total stock = "+this.quantiteProduit);
    }

    //creation d'une methode assurant la vente
    public void setVente()
    {
        System.out.println("\n\t\tEntrer la quantite vendue :");
        int quantite = scan.nextInt();
        this.quantiteProduit -= quantite;
        System.out.println("\t\t\t\t-------------**************------------------\n"+
                            "\t\t\t\t\tVENTE EFFECTUER AVEC SUCCES\n"+
                            "\t\t\t\t------------**************------------------");
        System.out.print("Total Restant = "+this.quantiteProduit);
    }

    //creation d'une methode pour consulter le stock d'un produit
    public void consultez_Stock_d1_Produit()
    {
        System.out.println("\n\t\tQuel produit voudriez vous consultez son stock :");
        String nomP = scan.nextLine();
        String no = scan.nextLine();

        for(int i=0; i<incrementationNombreTotalProduitsEnStock; i++)
        {
            if(listeProduit[i] == nomP)
            {
                System.out.print(listeProduit[i]);
                break;
            }

            while(listeProduit[i]!=nomP)
            {
                System.out.println("\nErreur le nom du produit rechercher est soit abscent dans le stock ou soit incorrect\nVeillez saisir de nouveau ");
                String newNomP = scan.nextLine();
                nomP = newNomP;
            }
            break;
        }
    }

        public String getNomProduit()
        {
            return this.nomProduit;
        }
/*----------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------*/

    // fonction pricipale main()
    public static void main(String[] args)
    {
        try
        {
            Scanner scan =  new Scanner(System.in);
            System.out.println("\t\t------------------------------------------------\n"+
                                "\t\t   VITAL_BOUTIQUE VOUS SOUHAITE LA BIENVENUE\n"+
                                "\t\t-----------------------------------------------\n");

            System.out.println("\nOPTIONS\n"+
                                "----------------------------------------------------------\n"+
                                "(0) creer un nouveau stock produits         | cliquez: [0]\n");


            System.out.print("-->");
            int optionZero = scan.nextInt();
            System.out.print("chargement ");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(". Terminer\n");




            while(optionZero!=0)
            {
                System.out.print("Choix incorrect reéssaiyez --> cliquez: [0] : ");
                optionZero = scan.nextInt();
            }
            for(int i=1; i>0; i++)
            {
            //CREATION D'UN PRODUIT ( OU PLUS EXACTEMENT CREATION D'UN OBJET )
                StockVitalBoutique p = new StockVitalBoutique();
                boolean verif=true;
                while(verif)
                {
                    int option=0;

                    System.out.println("\nOPTIONS\n"+
                                        "---------------------------------------------------\n"+
                                        "(1) creer un nouveau produit         | cliquez: [1]\n"+
                                        "(2) liste des produits en stock      | cliquez: [2]\n"+
                                        "(3) approvisionner un produit        | cliquez: [3]\n"+
                                        "(4) vente d'un produit               | cliquez: [4]\n"+
                                        "(5) consultez le stock d'un produit  | cliquez: [5]\n"

                                        );
                    System.out.print("-->");
                    option = scan.nextInt();
                    System.out.println();
                    System.out.print("chargement ");
                        Thread.sleep(300);
                        System.out.print(".");
                        Thread.sleep(300);
                        System.out.print(".");
                        Thread.sleep(300);
                        System.out.print(".");
                        Thread.sleep(300);
                        System.out.print(". Terminer\n");



                    /* il est Complexe d'appliquer switch() en java y'a certains criteres a prendre en compte qui me cout en temps donc j'ai laisser tomber pour utiliser des "if" meme si cela est moins economique */
                        if(option==1)
                            verif = false;
                        if(option==2)
                        {
                            p.liste_de_tous_les_produits_en_Stock();
                            Thread.sleep(800);
                        }

                        if(option==3)
                        {
                            p.setApprovisionnement();
                            Thread.sleep(800);
                        }

                        if(option==4)
                        {
                            p.setVente();
                            Thread.sleep(800);
                        }

                        if(option==5)
                        {
                            System.out.println("\nDesoler option non disponible toujours en cours de revision\n\t\tMerci pour la comprehension");
                            //p.consultez_Stock_d1_Produit();
                            System.out.print("\n<--RETOUR | cliquez[0] ");
                            int retour = scan.nextInt();
                        }
                        Thread.sleep(300);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
