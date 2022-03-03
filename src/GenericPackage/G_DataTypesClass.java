package GenericPackage;

import javax.xml.crypto.Data;

public class G_DataTypesClass<Datatype>  {

        private Datatype varName;

        public G_DataTypesClass(Datatype  v)
        {
            this.varName = v;
        }

        public G_DataTypesClass()
        {

        }

        public void setVarName(Datatype v)
        {
            this.varName = v;
        }

        public Datatype getVarname()
        {
            return this.varName;
        }

}
