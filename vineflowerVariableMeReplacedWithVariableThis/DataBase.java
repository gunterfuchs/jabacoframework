package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.Strings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase implements VB.IJabacoClass {
   private Connection myCon;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public boolean Connect(String url) {
      boolean Connect = false;
      Throwable Err = null;

      label314:
      try {
         myCon = null;
      } finally {
         break label314;
      }

      label311:
      try {
         myCon = DriverManager.getConnection(url);
      } finally {
         break label311;
      }

      label318: {
         label307: {
            label306:
            try {
               if (myCon != null) {
                  break label307;
               }
            } finally {
               break label306;
            }

            try {
               Connect = false;
               break label318;
            } finally {
               break label318;
            }
         }

         label296:
         try {
            ;
         } finally {
            break label296;
         }

         label294:
         try {
            Connect = true;
         } finally {
            break label294;
         }
      }

      try {
         ;
      } finally {
         return Connect;
      }

      return Connect;
   }

   public boolean Connect(String url, String user, String password) {
      boolean Connect = false;
      Throwable Err = null;

      label314:
      try {
         myCon = null;
      } finally {
         break label314;
      }

      label311:
      try {
         myCon = DriverManager.getConnection(url, user, password);
      } finally {
         break label311;
      }

      label318: {
         label307: {
            label306:
            try {
               if (myCon != null) {
                  break label307;
               }
            } finally {
               break label306;
            }

            try {
               Connect = false;
               break label318;
            } finally {
               break label318;
            }
         }

         label296:
         try {
            ;
         } finally {
            break label296;
         }

         label294:
         try {
            Connect = true;
         } finally {
            break label294;
         }
      }

      try {
         ;
      } finally {
         return Connect;
      }

      return Connect;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean ConnectMDB(String path) {
      boolean ConnectMDB = false;
      Throwable Err = null;

      try {
         ConnectMDB = Connect(Strings.StrCat("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=", path));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return ConnectMDB;
      }

      return ConnectMDB;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean ConnectMDB(String path, String user, String password) {
      boolean ConnectMDB = false;
      Throwable Err = null;

      try {
         ConnectMDB = Connect(Strings.StrCat("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=", path), user, password);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return ConnectMDB;
      }

      return ConnectMDB;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean ConnectDSN(String dsn) {
      boolean ConnectDSN = false;
      Throwable Err = null;

      try {
         ConnectDSN = Connect(Strings.StrCat("jdbc:odbc:", dsn));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return ConnectDSN;
      }

      return ConnectDSN;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean ConnectDSN(String dsn, String user, String password) {
      boolean ConnectDSN = false;
      Throwable Err = null;

      try {
         ConnectDSN = Connect(Strings.StrCat("jdbc:odbc:", dsn), user, password);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return ConnectDSN;
      }

      return ConnectDSN;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ResultSet ExecuteStatement(String sql) {
      ResultSet ExecuteStatement = null;
      Throwable Err = null;
      Statement myStmt = myCon.createStatement();

      try {
         ExecuteStatement = myStmt.executeQuery(sql);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return ExecuteStatement;
      }

      return ExecuteStatement;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean Execute(String sql) {
      boolean Execute = false;
      Throwable Err = null;
      Statement myStmt = myCon.createStatement();

      try {
         Execute = myStmt.execute(sql);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return Execute;
      }

      return Execute;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int ExecuteUpdate(String sql) {
      int ExecuteUpdate = 0;
      Throwable Err = null;
      Statement myStmt = myCon.createStatement();

      try {
         ExecuteUpdate = myStmt.executeUpdate(sql);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return ExecuteUpdate;
      }

      return ExecuteUpdate;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Connection $Connection() {
      Connection $Connection = null;
      Throwable Err = null;

      try {
         $Connection = myCon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Connection;
      }

      return $Connection;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Connection $Parent() {
      Connection $Parent = null;
      Throwable Err = null;

      try {
         $Parent = myCon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   public DataBase() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myCon = null;
   }
}
