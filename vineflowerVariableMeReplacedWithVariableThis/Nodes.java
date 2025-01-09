package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import VBA.VBVariant;

public class Nodes {
   private VB.TreeView myTree;
   private VB.Collection myHash;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Nodes(VB.TreeView refTree) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myTree = refTree;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.Node Add(VB.Node Relative, VB.TreeRelationshipConstants Relationship, String Key, String Text) {
      VB.Node Add = null;
      Throwable Err = null;

      try {
         Add = Add(Relative, Relationship, Key, Text, null);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return Add;
      }

      return Add;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.Node Add(VB.Node Relative, VB.TreeRelationshipConstants Relationship, String Key, String Text, IResource Image) {
      VB.Node Add = null;
      Throwable Err = null;
      VB.Node myNode = new VB.Node(myTree, Text);

      try {
         myNode.$Text(Text);
         myHash.Add(VBVariant.valueOf(myNode), Key);
         myNode.$Key(Key);
         myNode.$Icon(Image);
         myNode.$ForeColor(myTree.$ForeColor());
         myNode.$BackColor(myTree.$BackColor());
         myNode.$ForeColorSel(myTree.$ForeColorSel());
         myNode.$BackColorSel(myTree.$BackColorSel());
         myNode.$FontName(myTree.$FontName());
         myNode.$FontBold(myTree.$FontBold());
         myNode.$FontItalic(myTree.$FontItalic());
         myNode.$FontSize(myTree.$FontSize());
         if (Relative != null) {
            myTree.$Model().insertNodeInto(myNode, Relative, Relative.$ChildCount());
         } else {
            myTree.$Model().insertNodeInto(myNode, myTree.$Root(), myTree.$Root().$ChildCount());
         }

         myTree.$Root().$Expand(true);
         Add = myNode;
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return Add;
      }

      return Add;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Clear() {
      Throwable Err = null;

      try {
         myHash.Clear();
         myTree.$Root().removeAllChildren();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Count() {
      int $Count = 0;
      Throwable Err = null;

      try {
         $Count = myHash.Count();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Count;
      }

      return $Count;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.Node $Item(int Index) {
      VB.Node $Item = null;
      Throwable Err = null;

      try {
         $Item = (VB.Node)myHash.Item(Index).toObject();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Item;
      }

      return $Item;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.Node $Item(String Key) {
      VB.Node $Item = null;
      Throwable Err = null;

      try {
         $Item = (VB.Node)myHash.Item(Key).toObject();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Item;
      }

      return $Item;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean Remove(int Index) {
      boolean Remove = false;
      Throwable Err = null;
      VB.Node tmpNode = null;

      try {
         tmpNode = (VB.Node)myHash.Item(Index).toObject();
         if (Remove((VB.Node)tmpNode)) {
            myHash.Remove(Index);
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return Remove;
      }

      return Remove;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean Remove(String Key) {
      boolean Remove = false;
      Throwable Err = null;
      VB.Node tmpNode = null;

      try {
         tmpNode = (VB.Node)myHash.Item(Key).toObject();
         if (Remove((VB.Node)tmpNode)) {
            myHash.Remove(Key);
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return Remove;
      }

      return Remove;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean Remove(VB.Node Node) {
      boolean Remove = false;
      Throwable Err = null;

      try {
         myTree.$Model().removeNodeFromParent(Node);
         Remove = true;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Remove;
      }

      return Remove;
   }

   private void initVars() {
      myTree = null;
      myHash = new VB.Collection();
   }
}
