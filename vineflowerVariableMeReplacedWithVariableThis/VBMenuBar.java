package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;

public class VBMenuBar extends JMenuBar implements VB.IJabacoClass, ActionListener {
   private long myForeColor;
   private long myBackColor;
   private VB.IJabacoForm myOwner;

   public void _Visible(boolean b) {
   }

   public void _Click(VB.IMenuItem MenuItem) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.IJabacoForm $Owner() {
      VB.IJabacoForm $Owner = null;
      Throwable Err = null;

      try {
         $Owner = myOwner;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Owner;
      }

      return $Owner;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBMenuBar(VB.IJabacoForm Owner) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myOwner = Owner;
         $Parent().setOpaque(true);
         Class_Initialize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getBackground() {
      Color getBackground = null;
      Throwable Err = null;

      try {
         if (myOwner != null) {
            getBackground = Information.RGBtoColor(myOwner.$MenuBackColor());
         } else {
            getBackground = super.getBackground();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getBackground;
      }

      return getBackground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getForeground() {
      Color getForeground = null;
      Throwable Err = null;

      try {
         if (myOwner != null) {
            getForeground = Information.RGBtoColor(myOwner.$MenuForeColor());
         } else {
            getForeground = super.getForeground();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getForeground;
      }

      return getForeground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Font getFont() {
      Font getFont = null;
      Throwable Err = null;

      try {
         if (myOwner != null) {
            getFont = myOwner.$Font();
         } else {
            getFont = super.getFont();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getFont;
      }

      return getFont;
   }

   private void GoClick(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: aconst_null
      // 03: astore 4
      // 05: aload 1
      // 06: checkcast VB/IMenuItem
      // 09: checkcast VB/IMenuItem
      // 0c: astore 4
      // 0e: nop
      // 0f: aload 0
      // 10: aload 4
      // 12: invokevirtual VB/VBMenuBar._Click (LVB/IMenuItem;)V
      // 15: nop
      // 16: return
      // 17: nop
      // 18: aload 2
      // 19: checkcast java/lang/Throwable
      // 1c: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 1f: goto 15
      // 22: astore 3
      // 23: astore 2
      // 24: ret 3
      // 26: jsr 22
      // 29: goto 0e
   }

   public void add(Component Component) {
      Throwable Err = null;

      label44:
      try {
         super.add(Component);
      } finally {
         break label44;
      }

      try {
         $Visible(true);
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuGroup createMenuGroup(VB.VBMenuGroup Owner, String ControlID, String Caption) {
      VB.VBMenuGroup createMenuGroup = null;
      Throwable Err = null;

      try {
         createMenuGroup = createMenuGroup(Owner, ControlID, Caption, true);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return createMenuGroup;
      }

      return createMenuGroup;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuGroup createMenuGroup(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Visible) {
      VB.VBMenuGroup createMenuGroup = null;
      Throwable Err = null;

      try {
         createMenuGroup = createMenuGroup(Owner, ControlID, Caption, Visible, null);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return createMenuGroup;
      }

      return createMenuGroup;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuGroup createMenuGroup(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Visible, IResource IconPath) {
      VB.VBMenuGroup createMenuGroup = null;
      Throwable Err = null;

      try {
         createMenuGroup = createMenuGroup(Owner, ControlID, Caption, true, Visible, IconPath);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return createMenuGroup;
      }

      return createMenuGroup;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuGroup createMenuGroup(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Enabled, boolean Visible, IResource IconPath) {
      VB.VBMenuGroup createMenuGroup = null;
      Throwable Err = null;

      try {
         createMenuGroup = new VB.VBMenuGroup(this, Owner, ControlID, Caption, Enabled, Visible, IconPath);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return createMenuGroup;
      }

      return createMenuGroup;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void addSeparator() {
      Throwable Err = null;

      try {
         addSeparator(null);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void addSeparator(VB.VBMenuGroup Owner) {
      Throwable Err = null;
      JSeparator tmpMenuSep = new JSeparator();

      try {
         if (Owner != null) {
            Owner.add(tmpMenuSep);
         } else {
            add(tmpMenuSep);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuItem createMenu(VB.VBMenuGroup Owner, String ControlID, String Caption) {
      VB.VBMenuItem createMenu = null;
      Throwable Err = null;

      try {
         createMenu = createMenu(Owner, ControlID, Caption, true);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return createMenu;
      }

      return createMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuItem createMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Visible) {
      VB.VBMenuItem createMenu = null;
      Throwable Err = null;

      try {
         createMenu = createMenu(Owner, ControlID, Caption, Visible, null);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return createMenu;
      }

      return createMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuItem createMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Visible, IResource IconPath) {
      VB.VBMenuItem createMenu = null;
      Throwable Err = null;

      try {
         createMenu = createMenu(Owner, ControlID, Caption, true, Visible, IconPath);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return createMenu;
      }

      return createMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuItem createMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Enabled, boolean Visible, IResource IconPath) {
      VB.VBMenuItem createMenu = null;
      Throwable Err = null;

      try {
         createMenu = new VB.VBMenuItem(this, Owner, ControlID, Caption, Enabled, Visible, IconPath);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return createMenu;
      }

      return createMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBCheckBoxMenuItem createCheckBoxMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Checked) {
      VB.VBCheckBoxMenuItem createCheckBoxMenu = null;
      Throwable Err = null;

      try {
         createCheckBoxMenu = createCheckBoxMenu(Owner, ControlID, Caption, Checked, true);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return createCheckBoxMenu;
      }

      return createCheckBoxMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBCheckBoxMenuItem createCheckBoxMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Checked, boolean Visible) {
      VB.VBCheckBoxMenuItem createCheckBoxMenu = null;
      Throwable Err = null;

      try {
         createCheckBoxMenu = createCheckBoxMenu(Owner, ControlID, Caption, Checked, Visible, null);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return createCheckBoxMenu;
      }

      return createCheckBoxMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBCheckBoxMenuItem createCheckBoxMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Checked, boolean Visible, IResource IconPath) {
      VB.VBCheckBoxMenuItem createCheckBoxMenu = null;
      Throwable Err = null;

      try {
         createCheckBoxMenu = createCheckBoxMenu(Owner, ControlID, Caption, Checked, true, Visible, IconPath);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return createCheckBoxMenu;
      }

      return createCheckBoxMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBCheckBoxMenuItem createCheckBoxMenu(
      VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Checked, boolean Enabled, boolean Visible, IResource IconPath
   ) {
      VB.VBCheckBoxMenuItem createCheckBoxMenu = null;
      Throwable Err = null;

      try {
         createCheckBoxMenu = new VB.VBCheckBoxMenuItem(this, Owner, ControlID, Caption, Checked, Enabled, Visible, IconPath);
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return createCheckBoxMenu;
      }

      return createCheckBoxMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ButtonGroup createOptionButtonMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Selected) {
      ButtonGroup createOptionButtonMenu = null;
      Throwable Err = null;

      try {
         createOptionButtonMenu = createOptionButtonMenu(Owner, ControlID, Caption, Selected, true);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return createOptionButtonMenu;
      }

      return createOptionButtonMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ButtonGroup createOptionButtonMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, boolean Visible) {
      ButtonGroup createOptionButtonMenu = null;
      Throwable Err = null;

      try {
         createOptionButtonMenu = createOptionButtonMenu(Owner, ControlID, Caption, Selected, true, Visible, null);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return createOptionButtonMenu;
      }

      return createOptionButtonMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ButtonGroup createOptionButtonMenu(
      VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, boolean Enabled, boolean Visible, IResource IconPath
   ) {
      ButtonGroup createOptionButtonMenu = null;
      Throwable Err = null;
      ButtonGroup group = new ButtonGroup();
      new VB.VBOptionButtonMenuItem(this, Owner, ControlID, Caption, Selected, group, Enabled, Visible, IconPath);

      try {
         createOptionButtonMenu = group;
      } catch (Throwable var14) {
         Interaction.MsgBox(var14);
         return createOptionButtonMenu;
      }

      return createOptionButtonMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBOptionButtonMenuItem createOptionButtonMenu(
      VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group, boolean Enabled, boolean Visible, IResource IconPath
   ) {
      VB.VBOptionButtonMenuItem createOptionButtonMenu = null;
      Throwable Err = null;

      try {
         createOptionButtonMenu = new VB.VBOptionButtonMenuItem(this, Owner, ControlID, Caption, Selected, Group, Enabled, Visible, IconPath);
      } catch (Throwable var13) {
         Interaction.MsgBox(var13);
         return createOptionButtonMenu;
      }

      return createOptionButtonMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBOptionButtonMenuItem createOptionButtonMenu(
      VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group, boolean Visible, IResource IconPath
   ) {
      VB.VBOptionButtonMenuItem createOptionButtonMenu = null;
      Throwable Err = null;

      try {
         createOptionButtonMenu = createOptionButtonMenu(Owner, ControlID, Caption, Selected, Group, true, Visible, IconPath);
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return createOptionButtonMenu;
      }

      return createOptionButtonMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBOptionButtonMenuItem createOptionButtonMenu(
      VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group, boolean Visible
   ) {
      VB.VBOptionButtonMenuItem createOptionButtonMenu = null;
      Throwable Err = null;

      try {
         createOptionButtonMenu = createOptionButtonMenu(Owner, ControlID, Caption, Selected, Group, Visible, null);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return createOptionButtonMenu;
      }

      return createOptionButtonMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBOptionButtonMenuItem createOptionButtonMenu(VB.VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group) {
      VB.VBOptionButtonMenuItem createOptionButtonMenu = null;
      Throwable Err = null;

      try {
         createOptionButtonMenu = createOptionButtonMenu(Owner, ControlID, Caption, Selected, Group, true);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return createOptionButtonMenu;
      }

      return createOptionButtonMenu;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Height() {
      int $Height = 0;
      Throwable Err = null;

      try {
         if (!$Visible()) {
            $Height = 0;
         } else {
            $Height = $Parent().getHeight();
            if ($Height == 0) {
               $Height = (int)$Parent().getPreferredSize().getHeight();
            }
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Height;
      }

      return $Height;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Visible() {
      boolean $Visible = false;
      Throwable Err = null;

      try {
         $Visible = isVisible();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Visible;
      }

      return $Visible;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Visible(boolean v) {
      Throwable Err = null;

      try {
         if ($Parent().isVisible() != v) {
            $Parent().setVisible(v);
            if ($Parent().isVisible() == v) {
               _Visible(v);
            }
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JMenuBar $Parent() {
      JMenuBar $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   private void Class_Initialize() {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent e) {
      Throwable Err = null;

      try {
         GoClick(e.getSource());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private void initVars() {
      myForeColor = 0L;
      myBackColor = 0L;
      myOwner = null;
   }
}
