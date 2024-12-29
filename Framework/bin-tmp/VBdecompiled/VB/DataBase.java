/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VBA.Interaction;
import VBA.Strings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase
implements IJabacoClass {
    private Connection myCon;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Connect(String url) {
        Object var4_4;
        Throwable Err;
        boolean Connect;
        block16: {
            block15: {
                Connect = false;
                Err = null;
                try {
                    Me.myCon = null;
                }
                catch (Throwable throwable) {
                    var4_4 = null;
                    Err = throwable;
                }
                try {
                    Me.myCon = DriverManager.getConnection(url);
                }
                catch (Throwable throwable) {
                    var4_4 = null;
                    Err = throwable;
                }
                try {
                    DataBase Me;
                    if (Me.myCon == null) break block15;
                    break block16;
                }
                catch (Throwable throwable) {
                    var4_4 = null;
                    Err = throwable;
                }
            }
            try {
                try {
                    return false;
                }
                catch (Throwable throwable) {
                    var4_4 = null;
                    Err = throwable;
                    return Connect;
                }
            }
            catch (Throwable throwable) {
                var4_4 = null;
                Err = throwable;
            }
        }
        try {
            Connect = true;
            return Connect;
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return Connect;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Connect(String url, String user, String password) {
        Object var6_6;
        Throwable Err;
        boolean Connect;
        block16: {
            block15: {
                Connect = false;
                Err = null;
                try {
                    Me.myCon = null;
                }
                catch (Throwable throwable) {
                    var6_6 = null;
                    Err = throwable;
                }
                try {
                    Me.myCon = DriverManager.getConnection(url, user, password);
                }
                catch (Throwable throwable) {
                    var6_6 = null;
                    Err = throwable;
                }
                try {
                    DataBase Me;
                    if (Me.myCon == null) break block15;
                    break block16;
                }
                catch (Throwable throwable) {
                    var6_6 = null;
                    Err = throwable;
                }
            }
            try {
                try {
                    return false;
                }
                catch (Throwable throwable) {
                    var6_6 = null;
                    Err = throwable;
                    return Connect;
                }
            }
            catch (Throwable throwable) {
                var6_6 = null;
                Err = throwable;
            }
        }
        try {
            Connect = true;
            return Connect;
        }
        catch (Throwable throwable) {
            var6_6 = null;
            Err = throwable;
            return Connect;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean ConnectMDB(String path) {
        boolean ConnectMDB = false;
        Throwable Err = null;
        try {
            DataBase Me;
            return Me.Connect(Strings.StrCat("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=", path));
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return ConnectMDB;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean ConnectMDB(String path, String user, String password) {
        boolean ConnectMDB = false;
        Throwable Err = null;
        try {
            DataBase Me;
            return Me.Connect(Strings.StrCat("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=", path), user, password);
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return ConnectMDB;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean ConnectDSN(String dsn) {
        boolean ConnectDSN = false;
        Throwable Err = null;
        try {
            DataBase Me;
            return Me.Connect(Strings.StrCat("jdbc:odbc:", dsn));
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return ConnectDSN;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean ConnectDSN(String dsn, String user, String password) {
        boolean ConnectDSN = false;
        Throwable Err = null;
        try {
            DataBase Me;
            return Me.Connect(Strings.StrCat("jdbc:odbc:", dsn), user, password);
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return ConnectDSN;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ResultSet ExecuteStatement(String sql) {
        DataBase Me;
        ResultSet ExecuteStatement = null;
        Throwable Err = null;
        Statement myStmt = Me.myCon.createStatement();
        try {
            return myStmt.executeQuery(sql);
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return ExecuteStatement;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Execute(String sql) {
        DataBase Me;
        boolean Execute = false;
        Throwable Err = null;
        Statement myStmt = Me.myCon.createStatement();
        try {
            return myStmt.execute(sql);
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Execute;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int ExecuteUpdate(String sql) {
        DataBase Me;
        int ExecuteUpdate = 0;
        Throwable Err = null;
        Statement myStmt = Me.myCon.createStatement();
        try {
            return myStmt.executeUpdate(sql);
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return ExecuteUpdate;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Connection $Connection() {
        Connection $Connection = null;
        Throwable Err = null;
        try {
            DataBase Me;
            return Me.myCon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Connection;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Connection $Parent() {
        Connection $Parent = null;
        Throwable Err = null;
        try {
            DataBase Me;
            return Me.myCon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    public DataBase() {
        DataBase Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Me.myCon = null;
    }
}
