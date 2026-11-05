/*
 * Decompiled with CFR 0.152.
 */
package nick;

import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Map;
import java.util.Objects;
import nick.AugustusClassLoader;
import nick.Data;
import nick.Libraries;
import sun.misc.Unsafe;

public final class Augustus {
    public static void main(String[] args) throws Throwable {
        try (URLClassLoader ucl = Libraries.loader();){
            Field _u = Unsafe.class.getDeclaredField("theUnsafe");
            _u.setAccessible(true);
            Unsafe unsafe = (Unsafe)_u.get(null);
            unsafe.ensureClassInitialized(ucl.loadClass("launcher.41"));
            Class<?> _4v = ucl.loadClass("launcher.4v");
            Method _4v_1 = _4v.getDeclaredMethod("a", Long.TYPE, Long.TYPE, Object.class);
            try {
                Object _4v_s1 = _4v_1.invoke(null, 7268163872431129643L, -8735975056915242386L, MethodHandles.lookup().lookupClass());
                _4v_s1.getClass().getDeclaredMethod("a", Long.TYPE).invoke(_4v_s1, 33074648803191L);
                Class<?> c = ucl.loadClass("launcher.Controller");
                Object ci = c.getDeclaredConstructors()[0].newInstance(new Object[0]);
                Field cf = c.getDeclaredField("instance");
                cf.setAccessible(true);
                cf.set(null, ci);
            }
            catch (Throwable _t) {
                throw new RuntimeException(_t);
            }
            Map<String, byte[]> classes = Objects.requireNonNull(Data.classes());
            Map<String, byte[]> resources = Objects.requireNonNull(Data.resources());
            Class<?> classLoader = ucl.loadClass("launcher.444");
            Constructor<?> _444_c = classLoader.getDeclaredConstructor(new Class[0]);
            AugustusClassLoader loader = new AugustusClassLoader((ClassLoader)_444_c.newInstance(new Object[0]), classes, resources);
            Class<?> handlerClass = ucl.loadClass("launcher.41");
            Object handler = unsafe.allocateInstance(handlerClass);
            Field classMap = handlerClass.getDeclaredField("48");
            classMap.setAccessible(true);
            classMap.set(handler, classes);
            Field resourceMap = handlerClass.getDeclaredField("42");
            resourceMap.setAccessible(true);
            resourceMap.set(handler, resources);
            Field handlerField = handlerClass.getDeclaredField("47");
            handlerField.setAccessible(true);
            handlerField.set(null, handler);
            Map<String, byte[]> keys = Data.keys();
            for (Map.Entry<String, byte[]> entry : keys.entrySet()) {
                Field field = classLoader.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(null, entry.getValue());
            }
            String resourcePath = String.format("%s\\AppData\\Roaming\\ElectricLauncher\\data\\data\\augustus\\resources.jar", System.getProperty("user.home"));
            Path path = Paths.get(resourcePath, new String[0]);
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            Files.deleteIfExists(path);
            try (InputStream is = Objects.requireNonNull(Augustus.class.getClassLoader().getResourceAsStream("loader/resources.jar"));){
                Files.copy(is, path, new CopyOption[0]);
            }
            Libraries.create();
            Class<?> main = loader.loadClass("StartMinecraftDirectory");
            main.getDeclaredMethod("main", String[].class).invoke(null, new Object[]{new String[0]});
        }
    }
}

