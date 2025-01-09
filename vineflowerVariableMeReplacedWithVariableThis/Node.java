package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBVariant;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Node extends DefaultMutableTreeNode implements VB.IJabacoClass {
   private VB.TreeView myTree;
   private String myKey;
   private long myForeColor;
   private long myForeColorSel;
   private long myBackColor;
   private long myBackColorSel;
   private IResource myOpenIcon;
   private Icon resOpenIcon;
   private IResource myClosedIcon;
   private Icon resClosedIcon;
   private IResource myIcon;
   private Icon resDefaultIcon;
   private IResource myLeafIcon;
   private Icon resLeafIcon;
   private IResource myDisabledIcon;
   private Icon resDisabledIcon;
   private String myFontName;
   private boolean myFontBold;
   private boolean myFontItalic;
   private int myFontSize;
   private Font myFont;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.TreeView $OwnerTree() {
      VB.TreeView $OwnerTree = null;
      Throwable Err = null;

      try {
         $OwnerTree = myTree;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $OwnerTree;
      }

      return $OwnerTree;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SetDefaultIcons() {
      Throwable Err = null;

      try {
         resOpenIcon = UIManager.getIcon("Tree.openIcon");
         resClosedIcon = UIManager.getIcon("Tree.closedIcon");
         resLeafIcon = UIManager.getIcon("Tree.leafIcon");
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void SetDefaults() {
      Throwable Err = null;

      try {
         setAllowsChildren(true);
         $FontName("Arial");
         $FontSize(9);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Node(VB.TreeView refTree) {
      Throwable Err = null;
      super(refTree);
      initVars();

      try {
         myTree = refTree;
         SetDefaults();
         Class_Initialize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Node(VB.TreeView refTree, String Text) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myTree = refTree;
         $Text(Text);
         SetDefaults();
         Class_Initialize();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Expand() {
      boolean $Expand = false;
      Throwable Err = null;

      try {
         $Expand = myTree.isExpanded(this);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Expand;
      }

      return $Expand;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Expand(boolean v) {
      Throwable Err = null;

      try {
         if (!v) {
            myTree.collapseNode(this);
         } else {
            myTree.expandNode(this);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public boolean $Selected() {
      boolean $Selected = false;
      Throwable Err = null;

      try {
         $Selected = myTree.$Parent().isPathSelected($TreePath());
      } finally {
         return $Selected;
      }

      return $Selected;
   }

   public void $Selected(boolean v) {
      Throwable Err = null;

      label270:
      try {
         if ($Selected() == v) {
            return;
         }
      } finally {
         break label270;
      }

      label263: {
         label277: {
            try {
               if (v) {
                  break label277;
               }
            } finally {
               break label277;
            }

            label255:
            try {
               ;
            } finally {
               break label255;
            }

            try {
               myTree.$Parent().setSelectionPath(null);
               break label263;
            } finally {
               break label263;
            }
         }

         label253:
         try {
            myTree.$Parent().setSelectionPath($TreePath());
         } finally {
            break label253;
         }
      }

      try {
         ;
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Key() {
      String $Key = "";
      Throwable Err = null;

      try {
         $Key = myKey;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Key;
      }

      return $Key;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Key(String sKey) {
      Throwable Err = null;

      try {
         myKey = sKey;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Visible() {
      boolean $Visible = false;
      Throwable Err = null;

      try {
         $Visible = myTree.isVisible(this);
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
         if (!v) {
            myTree.collapseNode(this);
         } else {
            myTree.expandNode(this);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.Node $ParentNode() {
      VB.Node $ParentNode = null;
      Throwable Err = null;

      try {
         $ParentNode = (VB.Node)super.getParent();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ParentNode;
      }

      return $ParentNode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $ChildCount() {
      int $ChildCount = 0;
      Throwable Err = null;

      try {
         $ChildCount = super.getChildCount();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ChildCount;
      }

      return $ChildCount;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public DefaultMutableTreeNode $AsMutableTreeNode() {
      DefaultMutableTreeNode $AsMutableTreeNode = null;
      Throwable Err = null;

      try {
         $AsMutableTreeNode = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AsMutableTreeNode;
      }

      return $AsMutableTreeNode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Text() {
      String $Text = "";
      Throwable Err = null;

      try {
         $Text = super.getUserObject().toString();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Text;
      }

      return $Text;
   }

   public void $Text(String s) {
      Throwable Err = null;

      label44:
      try {
         super.setUserObject(s);
      } finally {
         break label44;
      }

      try {
         myTree.$Model().nodeChanged(this);
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $OpenIcon() {
      IResource $OpenIcon = null;
      Throwable Err = null;

      try {
         $OpenIcon = myOpenIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $OpenIcon;
      }

      return $OpenIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $OpenIcon(IResource refIcon) {
      Throwable Err = null;

      try {
         myOpenIcon = refIcon;
         resOpenIcon = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AllowsChildren() {
      boolean $AllowsChildren = false;
      Throwable Err = null;

      try {
         $AllowsChildren = super.getAllowsChildren();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AllowsChildren;
      }

      return $AllowsChildren;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $AllowsChildren(boolean v) {
      Throwable Err = null;

      try {
         super.setAllowsChildren(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $ClosedIcon() {
      IResource $ClosedIcon = null;
      Throwable Err = null;

      try {
         $ClosedIcon = myClosedIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ClosedIcon;
      }

      return $ClosedIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ClosedIcon(IResource refIcon) {
      Throwable Err = null;

      try {
         myClosedIcon = refIcon;
         resClosedIcon = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $Icon() {
      IResource $Icon = null;
      Throwable Err = null;

      try {
         $Icon = myIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Icon;
      }

      return $Icon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Icon(IResource refIcon) {
      Throwable Err = null;

      try {
         myIcon = refIcon;
         resDefaultIcon = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $DisabledIcon() {
      IResource $DisabledIcon = null;
      Throwable Err = null;

      try {
         $DisabledIcon = myDisabledIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $DisabledIcon;
      }

      return $DisabledIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $DisabledIcon(IResource refIcon) {
      Throwable Err = null;

      try {
         myDisabledIcon = refIcon;
         resDisabledIcon = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $LeafIcon() {
      IResource $LeafIcon = null;
      Throwable Err = null;

      try {
         $LeafIcon = myLeafIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $LeafIcon;
      }

      return $LeafIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $LeafIcon(IResource refIcon) {
      Throwable Err = null;

      try {
         myLeafIcon = refIcon;
         resLeafIcon = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Icon GetIcon(VB.TreeIconEnum IconType) {
      Icon GetIcon = null;
      Throwable Err = null;
      new VB.TreeIconEnum();
      VB.TreeIconEnum h6 = null;

      try {
         if (IconType.compareTo(VB.TreeIconEnum.TreeIconDefault) != 0) {
            if (IconType.compareTo(VB.TreeIconEnum.TreeIconOpen) != 0) {
               if (IconType.compareTo(VB.TreeIconEnum.TreeIconClosed) != 0) {
                  if (IconType.compareTo(VB.TreeIconEnum.TreeIconDisabled) != 0) {
                     if (IconType.compareTo(VB.TreeIconEnum.TreeIconLeaf) == 0) {
                        if (resLeafIcon == null) {
                           resLeafIcon = VB.Global.LoadIcon($LeafIcon());
                        }

                        GetIcon = resLeafIcon;
                     }
                  } else {
                     if (resDefaultIcon == null) {
                        resDisabledIcon = VB.Global.LoadIcon($DisabledIcon());
                     }

                     GetIcon = resDisabledIcon;
                  }
               } else {
                  if (resClosedIcon == null) {
                     resClosedIcon = VB.Global.LoadIcon($ClosedIcon());
                  }

                  GetIcon = resClosedIcon;
               }
            } else {
               if (resOpenIcon == null) {
                  resOpenIcon = VB.Global.LoadIcon($OpenIcon());
               }

               GetIcon = resOpenIcon;
            }
         } else {
            if (resDefaultIcon == null) {
               resDefaultIcon = VB.Global.LoadIcon($Icon());
            }

            GetIcon = resDefaultIcon;
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return GetIcon;
      }

      return GetIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $FontName() {
      String $FontName = "";
      Throwable Err = null;

      try {
         $FontName = myFontName;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontName;
      }

      return $FontName;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontName(String val) {
      Throwable Err = null;

      try {
         myFontName = val;
         myFont = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $FontBold() {
      boolean $FontBold = false;
      Throwable Err = null;

      try {
         $FontBold = myFontBold;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontBold;
      }

      return $FontBold;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontBold(boolean val) {
      Throwable Err = null;

      try {
         myFontBold = val;
         myFont = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $FontItalic() {
      boolean $FontItalic = false;
      Throwable Err = null;

      try {
         $FontItalic = myFontItalic;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontItalic;
      }

      return $FontItalic;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontItalic(boolean val) {
      Throwable Err = null;

      try {
         myFontItalic = val;
         myFont = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $FontSize() {
      int $FontSize = 0;
      Throwable Err = null;

      try {
         $FontSize = myFontSize;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontSize;
      }

      return $FontSize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontSize(int val) {
      Throwable Err = null;

      try {
         myFontSize = val;
         myFont = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Font $Font() {
      Font $Font = null;
      Throwable Err = null;

      try {
         if (myFont == null) {
            myFont = new Font(
               $FontName(),
               (int)(
                  Interaction.IIF($FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                     | Interaction.IIF($FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
               ),
               VB.Global.VBFontSizeToJFontSize($FontSize())
            );
         }

         $Font = myFont;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Font;
      }

      return $Font;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColorSel() {
      long $BackColorSel = 0L;
      Throwable Err = null;

      try {
         $BackColorSel = myBackColorSel;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorSel;
      }

      return $BackColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColorSel(long v) {
      Throwable Err = null;

      try {
         myBackColorSel = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColor() {
      long $BackColor = 0L;
      Throwable Err = null;

      try {
         $BackColor = myBackColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColor;
      }

      return $BackColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColor(long v) {
      Throwable Err = null;

      try {
         myBackColor = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ForeColorSel() {
      long $ForeColorSel = 0L;
      Throwable Err = null;

      try {
         $ForeColorSel = myForeColorSel;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColorSel;
      }

      return $ForeColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ForeColorSel(long v) {
      Throwable Err = null;

      try {
         myForeColorSel = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ForeColor() {
      long $ForeColor = 0L;
      Throwable Err = null;

      try {
         $ForeColor = myForeColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColor;
      }

      return $ForeColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ForeColor(long v) {
      Throwable Err = null;

      try {
         myForeColor = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public TreePath $TreePath() {
      TreePath $TreePath = null;
      Throwable Err = null;

      try {
         $TreePath = new TreePath(VBArray.createVBArray(super.getPath()).objectArray());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $TreePath;
      }

      return $TreePath;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public String toString() {
      String toString = "";
      Throwable Err = null;

      try {
         toString = $Text();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return toString;
      }

      return toString;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void removeAllChildren() {
      Throwable Err = null;

      try {
         super.removeAllChildren();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         SetDefaultIcons();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      myTree = null;
      myKey = "";
      myForeColor = 0L;
      myForeColorSel = 0L;
      myBackColor = 0L;
      myBackColorSel = 0L;
      myOpenIcon = null;
      resOpenIcon = null;
      myClosedIcon = null;
      resClosedIcon = null;
      myIcon = null;
      resDefaultIcon = null;
      myLeafIcon = null;
      resLeafIcon = null;
      myDisabledIcon = null;
      resDisabledIcon = null;
      myFontName = "";
      myFontBold = false;
      myFontItalic = false;
      myFontSize = 0;
      myFont = null;
   }
}
