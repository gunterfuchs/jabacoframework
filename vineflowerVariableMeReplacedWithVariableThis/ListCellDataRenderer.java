package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class ListCellDataRenderer extends DefaultListCellRenderer implements VB.IJabacoClass {
   private VB.IListCellDataOwner myOwner;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ListCellDataRenderer(VB.IListCellDataOwner owner) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myOwner = owner;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Component getListCellRendererComponent(JList List, Object Value, int Index, boolean IsSelected, boolean CellHasFocus) {
      Component getListCellRendererComponent = null;
      Throwable Err = null;
      Component tmpComponent = null;
      VB.ListCellData tmpCellData = (VB.ListCellData)Value;

      label2021: {
         label2037: {
            label2014: {
               try {
                  if (!(tmpCellData != null & myOwner != null)) {
                     break label2037;
                  }
               } catch (Throwable var352) {
                  boolean var10001 = false;
                  break label2014;
               }

               label2011:
               try {
                  ;
               } catch (Throwable var351) {
                  boolean var353 = false;
                  break label2011;
               }
            }

            label2003:
            try {
               if (Index > -1 * 1) {
                  tmpComponent = (Component)Interaction.IIF(
                        tmpCellData.$Icon() == null & !tmpCellData.$AsCheckBox(), VBVariant.valueOf(this), new VBVariant(null)
                     )
                     .toObject();
               }
            } finally {
               break label2003;
            }

            label2000:
            try {
               getListCellRendererComponent = tmpCellData.getComponent(myOwner, tmpComponent, IsSelected, CellHasFocus);
            } finally {
               break label2000;
            }

            label1996: {
               label2038: {
                  label2027: {
                     try {
                        if (Index % 2 != 1) {
                           break label1996;
                        }
                     } catch (Throwable var348) {
                        boolean var354 = false;
                        break label2027;
                     }

                     try {
                        if (IsSelected) {
                           break label2038;
                        }
                     } finally {
                        break label2027;
                     }

                     label1989:
                     try {
                        ;
                     } catch (Throwable var347) {
                        boolean var355 = false;
                        break label1989;
                     }
                  }

                  label1981: {
                     label2028: {
                        label2039: {
                           try {
                              if (myOwner.$BackColorAlternating() != (long)0) {
                                 break label2039;
                              }
                           } catch (Throwable var345) {
                              boolean var356 = false;
                              break label2028;
                           }

                           try {
                              break label2028;
                           } catch (Throwable var344) {
                              boolean var357 = false;
                              break label2028;
                           }
                        }

                        label1968:
                        try {
                           ;
                        } finally {
                           break label1968;
                        }

                        try {
                           getListCellRendererComponent.setBackground(Information.RGBtoColor(tmpCellData.$Owner().$BackColorAlternating()));
                           break label1981;
                        } finally {
                           break label1981;
                        }
                     }

                     label1966:
                     try {
                        getListCellRendererComponent.setBackground(tmpCellData.$Owner().getBackground());
                     } finally {
                        break label1966;
                     }
                  }

                  label1963:
                  try {
                     ;
                  } finally {
                     break label1963;
                  }
               }

               try {
                  ;
               } catch (Throwable var339) {
                  boolean var358 = false;
                  break label2021;
               }
            }

            try {
               break label2021;
            } catch (Throwable var338) {
               boolean var359 = false;
               break label2021;
            }
         }

         label1952:
         try {
            ;
         } finally {
            break label1952;
         }

         label1950:
         try {
            getListCellRendererComponent = super.getListCellRendererComponent(List, Value, Index, IsSelected, CellHasFocus);
         } finally {
            break label1950;
         }
      }

      try {
         ;
      } finally {
         return getListCellRendererComponent;
      }

      return getListCellRendererComponent;
   }

   private void initVars() {
      myOwner = null;
   }
}
