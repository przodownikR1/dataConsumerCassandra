package pl.java.scalatech.dataConsumerCassandra.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
class MessagingConfig {


}
