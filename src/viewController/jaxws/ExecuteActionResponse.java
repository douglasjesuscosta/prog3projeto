
package viewController.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.7
 * Tue Nov 29 08:01:14 GMT-03:00 2016
 * Generated source version: 3.1.7
 */

@XmlRootElement(name = "executeActionResponse", namespace = "http://viewController/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeActionResponse", namespace = "http://viewController/")

public class ExecuteActionResponse {

    @XmlElement(name = "return")
    private communication.Pack _return;

    public communication.Pack getReturn() {
        return this._return;
    }

    public void setReturn(communication.Pack new_return)  {
        this._return = new_return;
    }

}

