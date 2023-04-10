public class item {
    private int harga;
    private String nama;
    private String rank;
    private int quantity;

    public item(int harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void seeAllItem(){
        System.out.println("Your Item backpack worth: 23000 with item as listed below :");
        System.out.println(getQuantity() + " " + getRank() + " " + getNama() + " " + "worth : " + " " + getHarga());
    }

    public void seeAllItem1(){
        System.out.println(getQuantity() + " " + getRank() + " " + getNama() + " " + "worth : " + " " + getHarga());
    }

    public class item {
        private static item items[]=new item[1000];
        private static int counter=0;
        private int harga,quantity;
        private static int hartot=0;
        private String nama;
        private char rank;
        public item(int harga, String nama, char rank, int quantity){
            this.harga=harga*quantity;
            this.nama=nama;
            this.rank=rank;
            this.quantity=quantity;
            this.hartot+=this.harga;
            items[counter]=this;
            counter++;
        }
        public void seeAllItem(){
            System.out.println("Your item backpack worth: "+this.hartot+" with item listed below:");
            for (int i=0;i<counter;i++){
                System.out.println(items[i].quantity+" "+items[i].rank+" "+items[i].nama+" worth: "+items[i].harga);
            }
        }
    }


}
