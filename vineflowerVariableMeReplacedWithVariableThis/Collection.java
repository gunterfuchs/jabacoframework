package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Conversion;
import VBA.Interaction;
import VBA.Math;
import VBA.Strings;
import VBA.VBVariant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection implements VB.IJabacoClass {
   private HashMap myObjectList;
   private LinkedList myKeyArray;

   private String createUniqueKey(int KeyLength) {
      String createUniqueKey = "";
      Throwable Err = null;
      int h8 = 0;
      int h9 = 0;
      int i = 0;
      String ret = "";
      i = 1;
      h8 = KeyLength;
      h9 = 1;

      while (true) {
         if (i > h8) {
            label73:
            try {
               createUniqueKey = ret;
               break;
            } finally {
               break label73;
            }
         } else {
            label87: {
               try {
                  ret = Strings.StrCat(ret, Conversion.CStr(VBVariant.valueOf(Strings.Chr(Conversion.CInt(VBVariant.valueOf(Math.Rnd() * (double)26)) + 65))));
               } finally {
                  break label87;
               }

               i += h9;
               continue;
            }
         }

         Interaction.MsgBox((Throwable)Err);
         break;
      }

      return createUniqueKey;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized boolean Add(VBVariant Item) {
      boolean Add = false;
      Throwable Err = null;

      try {
         Add = Add(Item, Count());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Add;
      }

      return Add;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized boolean Add(VBVariant Item, int After) {
      boolean Add = false;
      Throwable Err = null;

      try {
         Add = Add(Item, After, createUniqueKey(32));
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return Add;
      }

      return Add;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized boolean Add(VBVariant Item, String Key) {
      boolean Add = false;
      Throwable Err = null;

      try {
         Add = Add(Item, Count(), Key);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return Add;
      }

      return Add;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private synchronized boolean Add(VBVariant Item, int After, String Key) {
      boolean Add = false;
      Throwable Err = null;

      try {
         if (Item(Key).compareTo(new VBVariant(null)) == 0) {
            myObjectList.put((String)Key, Item.toObject());
            myKeyArray.add(After, (String)Key);
            Add = true;
         }
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return Add;
      }

      return Add;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized void Clear() {
      Throwable Err = null;

      try {
         myObjectList.clear();
         myKeyArray.clear();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized boolean KeyExists(String Key) {
      boolean KeyExists = false;
      Throwable Err = null;

      try {
         KeyExists = myObjectList.containsKey(Key);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return KeyExists;
      }

      return KeyExists;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized int Count() {
      int Count = 0;
      Throwable Err = null;

      try {
         Count = myObjectList.size();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return Count;
      }

      return Count;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized Iterator Iterator() {
      Iterator Iterator = null;
      Throwable Err = null;

      try {
         Iterator = myObjectList.values().iterator();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return Iterator;
      }

      return Iterator;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized LinkedList Keys() {
      LinkedList Keys = null;
      Throwable Err = null;

      try {
         Keys = myKeyArray;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return Keys;
      }

      return Keys;
   }

   public synchronized VBVariant Item(int Index) {
      VBVariant Item = new VBVariant();
      Throwable Err = null;

      label44:
      try {
         Index--;
      } finally {
         break label44;
      }

      try {
         Item = Item(Conversion.CStr((String)myKeyArray.get(Index)));
      } finally {
         return Item;
      }

      return Item;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized VBVariant Item(String Key) {
      VBVariant Item = new VBVariant();
      Throwable Err = null;

      try {
         Item = VBVariant.valueOf(myObjectList.get(Key));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Item;
      }

      return Item;
   }

   public synchronized boolean Remove(String Key) {
      boolean Remove = 0;
      Throwable Err = null;

      label44:
      try {
         myKeyArray.remove(myKeyArray.indexOf(Key));
      } finally {
         break label44;
      }

      try {
         Remove = Double.valueOf(myObjectList.remove(Key).toString()).intValue();
      } finally {
         return (boolean)Remove;
      }

      return (boolean)Remove;
   }

   public boolean Remove(int Index) {
      boolean Remove = false;
      Throwable Err = null;

      label44:
      try {
         Index--;
      } finally {
         break label44;
      }

      try {
         Remove = Remove(Conversion.CStr((String)myKeyArray.get(Index)));
      } finally {
         return Remove;
      }

      return Remove;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ArrayList $Parent() {
      ArrayList $Parent = null;
      Throwable Err = null;

      try {
         $Parent = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return (ArrayList)$Parent;
      }

      return (ArrayList)$Parent;
   }

   public Collection() {
      initVars();
   }

   private void initVars() {
      myObjectList = new HashMap();
      myKeyArray = new LinkedList();
   }
}
