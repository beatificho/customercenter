package cafeteria

import scala.beans.BeanProperty
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Mypage {
  @BeanProperty
  var id :Long = 0L
  
  @BeanProperty
  var orderId :Long = 0L
  
  @BeanProperty
  var productName :String = null
  
  @BeanProperty
  var qty :Integer = 0
  
  @BeanProperty
  var amt :Integer = 0
  
  @BeanProperty
  var phoneNumber :String = null
  
  @BeanProperty
  var status :String = null
}
