/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.kafkasink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelKafkasinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_KAFKASINK_KAMELET_TOPIC_CONF = "camel.kamelet.kafka-sink.topic";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_TOPIC_DOC = "Comma separated list of Kafka topic names";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_TOPIC_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_BROKERS_CONF = "camel.kamelet.kafka-sink.brokers";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_BROKERS_DOC = "Comma separated list of Kafka Broker URLs";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_BROKERS_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_SECURITY_PROTOCOL_CONF = "camel.kamelet.kafka-sink.securityProtocol";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_SECURITY_PROTOCOL_DOC = "Protocol used to communicate with brokers. SASL_PLAINTEXT, PLAINTEXT, SASL_SSL and SSL are supported";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_SECURITY_PROTOCOL_DEFAULT = "SASL_SSL";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_SASL_MECHANISM_CONF = "camel.kamelet.kafka-sink.saslMechanism";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_SASL_MECHANISM_DOC = "The Simple Authentication and Security Layer (SASL) Mechanism used.";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_SASL_MECHANISM_DEFAULT = "PLAIN";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_USERNAME_CONF = "camel.kamelet.kafka-sink.username";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_USERNAME_DOC = "Username to authenticate to Kafka";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_PASSWORD_CONF = "camel.kamelet.kafka-sink.password";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_PASSWORD_DOC = "Password to authenticate to kafka";
    public static final String CAMEL_SINK_KAFKASINK_KAMELET_PASSWORD_DEFAULT = null;

    public CamelKafkasinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelKafkasinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_KAFKASINK_KAMELET_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASINK_KAMELET_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASINK_KAMELET_TOPIC_DOC);
        conf.define(CAMEL_SINK_KAFKASINK_KAMELET_BROKERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASINK_KAMELET_BROKERS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASINK_KAMELET_BROKERS_DOC);
        conf.define(CAMEL_SINK_KAFKASINK_KAMELET_SECURITY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASINK_KAMELET_SECURITY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASINK_KAMELET_SECURITY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_KAFKASINK_KAMELET_SASL_MECHANISM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASINK_KAMELET_SASL_MECHANISM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASINK_KAMELET_SASL_MECHANISM_DOC);
        conf.define(CAMEL_SINK_KAFKASINK_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASINK_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASINK_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SINK_KAFKASINK_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_KAFKASINK_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASINK_KAMELET_PASSWORD_DOC);
        return conf;
    }
}