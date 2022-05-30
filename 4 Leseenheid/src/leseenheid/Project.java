package leseenheid;

public class Project extends LesEenheid {

    private Cijfer productCijfer;
    private Cijfer procesCijfer;
    private Cijfer methodenEnTechniekenCijfer;

    public Project(String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);

        this.productCijfer = Cijfer.geenCijfer;
        this.procesCijfer = Cijfer.geenCijfer;
        this.methodenEnTechniekenCijfer = Cijfer.geenCijfer;
    }

    public Project(double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer, String naam, int ects, int studiejaar){
        this(naam, ects, studiejaar);

        this.productCijfer = Cijfer.fromNumber(productCijfer);
        this.procesCijfer = Cijfer.fromNumber(procesCijfer);
        this.methodenEnTechniekenCijfer = Cijfer.fromNumber(methodenEnTechniekenCijfer);
    }

    public Cijfer getProductCijfer() { return productCijfer; }

    public void setProductcijfer(double productCijfer) { this.productCijfer = Cijfer.fromNumber(productCijfer); }

    public void setProductcijfer(Cijfer productCijfer) { this.productCijfer = productCijfer; }

    public Cijfer getMethodenEnTechniekenCijfer() { return methodenEnTechniekenCijfer; }

    public void setMethodenEnTechniekenCijfer(double methodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = Cijfer.fromNumber(methodenEnTechniekenCijfer);
    }

    public void setMethodenEnTechniekenCijfer(Cijfer methodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    public Cijfer getProcescijfer() { return procesCijfer; }

    public void setProcescijfer(double procesCijfer) { this.procesCijfer = Cijfer.fromNumber(procesCijfer); }

    public void setProcescijfer( Cijfer procesCijfer ) { this.procesCijfer = procesCijfer; }

    @Override
    public boolean isAfgerond() {
        return this.methodenEnTechniekenCijfer.isVoldoende() &&
                this.procesCijfer.isVoldoende() &&
                this.productCijfer.isVoldoende();
    }

    @Override
    public String toString() {
        return String.format("%s (%s,%s,%s)", super.toString(), this.productCijfer, this.procesCijfer, this.methodenEnTechniekenCijfer);
    }
}

