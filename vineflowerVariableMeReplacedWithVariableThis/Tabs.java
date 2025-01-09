package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;

public class Tabs {
   private VB.TabStrip myTabStrip;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Tabs(VB.TabStrip refTabStrip) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myTabStrip = refTabStrip;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public int $TabCount() {
      int $TabCount = 0;
      Throwable Err = null;

      try {
         $TabCount = myTabStrip.$Parent().getComponentCount();
      } finally {
         return $TabCount;
      }

      return $TabCount;
   }

   public String $Caption(int Index) {
      String $Caption = "";
      Throwable Err = null;

      try {
         $Caption = myTabStrip.$Parent().getTitleAt(Index - 1);
      } finally {
         return $Caption;
      }

      return $Caption;
   }

   public void $Caption(int Index, String Title) {
      Throwable Err = null;

      try {
         myTabStrip.$Parent().setTitleAt(Index - 1, Title);
      } finally {
         return;
      }
   }

   public VB.Usercontrol $Item(int Index) {
      VB.Usercontrol $Item = null;
      Throwable Err = null;

      try {
         $Item = (VB.Usercontrol)myTabStrip.$Parent().getComponentAt(Index - 1);
      } finally {
         return $Item;
      }

      return $Item;
   }

   public void $Item(int Index, VB.Usercontrol v) {
      Throwable Err = null;

      try {
         myTabStrip.$Parent().setComponentAt(Index - 1, v);
      } finally {
         return;
      }
   }

   public void Clear() {
      Throwable Err = null;

      try {
         myTabStrip.$Parent().removeAll();
      } finally {
         return;
      }
   }

   public void Remove(int Index) {
      Throwable Err = null;

      try {
         myTabStrip.$Parent().remove(Index);
      } finally {
         return;
      }
   }

   public void Remove(VB.Usercontrol v) {
      Throwable Err = null;

      try {
         myTabStrip.$Parent().remove(v);
      } finally {
         return;
      }
   }

   public void Add(VB.Usercontrol Component, String Title) {
      Throwable Err = null;

      label44:
      try {
         Component.$Opaque(false);
      } finally {
         break label44;
      }

      try {
         myTabStrip.$Parent().addTab(Title, Component);
      } finally {
         return;
      }
   }

   public void Add(VB.Usercontrol Component, String Title, IResource IconPath) {
      Throwable Err = null;

      label44:
      try {
         Component.$Opaque(false);
      } finally {
         break label44;
      }

      try {
         myTabStrip.$Parent().addTab(Title, VB.Global.LoadIcon(IconPath), Component);
      } finally {
         return;
      }
   }

   public void Add(VB.Usercontrol Component, String Title, IResource IconPath, String ToolTip) {
      Throwable Err = null;

      label44:
      try {
         Component.$Opaque(false);
      } finally {
         break label44;
      }

      try {
         myTabStrip.$Parent().addTab(Title, VB.Global.LoadIcon(IconPath), Component, ToolTip);
      } finally {
         return;
      }
   }

   private void initVars() {
      myTabStrip = null;
   }
}
