package ac;
public interface InterfaceAc {

    public static int KEADAAN_MATI_AC = 0;
    public static int KEADAAN_HIDUP_AC = 1;
    public static int KEADAAN_DINGIN_AC = 0;
    public static int KEADAAN_PANAS_AC = 1;

    public abstract void matikan();
    public abstract void hidupkan();
    public abstract void dinginkan();
    public abstract void panaskan();
}
