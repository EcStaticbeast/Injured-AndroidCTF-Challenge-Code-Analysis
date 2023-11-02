public class Flagsix
{
    public static void main(String[] args) {
        
       String a="k3FElEG9lnoWbOateGhj5pX6QsXRNJKh///8Jxi8KXW7iDpk2xRxhQ=="

    }

    public class k {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f1472a = h.b();
    
        /* renamed from: b  reason: collision with root package name */
        private static final byte[] f1473b = h.a();
    
        public static String a(String str) {
            if (c(str)) {
                try {
                    SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(f1472a));
                    byte[] decode = Base64.decode(str, 0);
                    Cipher cipher = Cipher.getInstance("DES");
                    cipher.init(2, generateSecret);
                    return new String(cipher.doFinal(decode));
                } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Not a string!");
            }
            return str;
        }
    
        public static String b(String str) {
            if (c(str)) {
                try {
                    SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(f1473b));
                    byte[] decode = Base64.decode(str, 0);
                    Cipher cipher = Cipher.getInstance("DES");
                    cipher.init(2, generateSecret);
                    return new String(cipher.doFinal(decode));
                } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Not a string!");
            }
            return str;
        }
    
        public static boolean c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                Base64.decode(str, 0);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
    public class h {

        /* renamed from: a  reason: collision with root package name */
        private static byte[] f1469a = Base64.decode("Q2FwdHVyM1RoMXM=", 0);
    
        /* renamed from: b  reason: collision with root package name */
        private static byte[] f1470b = Base64.decode("e0NhcHR1cjNUaDFzVG9vfQ==", 0);
    
        /* renamed from: c  reason: collision with root package name */
        private static String f1471c = "9EEADi^^:?;FC652?5C@:5]7:C632D6:@]4@>^DB=:E6];D@?";
    
        /* JADX INFO: Access modifiers changed from: package-private */
        public static byte[] a() {
            return f1470b;
        }
    
        /* JADX INFO: Access modifiers changed from: package-private */
        public static byte[] b() {
            return f1469a;
        }
    
        /* JADX INFO: Access modifiers changed from: package-private */
        public static String c() {
            return f1471c;
        }
    }

}
