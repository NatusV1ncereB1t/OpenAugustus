package recovery.custom;
/** Remove only the obsolete main-menu connection notice from text drawing. */
public final class MenuNotice {
 private MenuNotice() {}
 public static String filter(String text) {
  if(text==null)return null;
  String plain=text.replaceAll("\u00a7.", "").toLowerCase(java.util.Locale.ROOT);
  return plain.contains("connect") && plain.contains("successfully") && plain.contains("augustus") && plain.contains("server") ? "" : text;
 }
}
