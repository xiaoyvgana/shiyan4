Plantuml代码：
@startuml
' 定义主包
package org.springframework.ai.core.model {

    ' 定义接口
    interface ApiKey
    interface ChatModelDescription
    interface Content
    interface EmbeddingModelDescription
    interface MediaContent
    interface Model
    interface ModelDescription
    interface ModelOptions
    interface ModelRequest
    interface ModelResponse
    interface ModelResult
    interface ResponseMetadata
    interface ResultMetadata
    interface StreamingModel

    ' 定义类
    class AbstractResponseMetadata
    class EmbeddingUtils
    class KotlinModule
    class Media
    class ModelOptionsUtils
    class MutableResponseMetadata
    class NoopApiKey
    class PackageInfo
    class SimpleApiKey

    ' 定义子包
    package function {
        class AbstractFunctionCallback
        class DefaultCommonCallbackInvokingSpec
        class DefaultFunctionCallbackBuilder
        class DefaultFunctionCallbackResolver
        class DefaultFunctionCallingOptions
        class DefaultFunctionCallingOptionsBuilder
        interface FunctionCallback
        interface FunctionCallbackResolver
        class FunctionCallingHelper
        interface FunctionCallingOptions
        class FunctionInvokingFunctionCallback
        class MethodInvokingFunctionCallback
    }

    package observation {
        class ErrorLoggingObservationHandler
        class ModelObservationContext
        class ModelUsageMetricsGenerator
        class PackageInfo
    }

    package tool {
        class DefaultToolCallingChatOptions
        class DefaultToolCallingManager
        class DefaultToolExecutionResult
        class LegacyToolCallingManager
        class PackageInfo
        interface ToolCallingChatOptions
        interface ToolCallingManager
        interface ToolExecutionResult
    }
}

' 定义关系
AbstractResponseMetadata --|> ResponseMetadata
MutableResponseMetadata --|> ResponseMetadata
NoopApiKey --|> ApiKey
SimpleApiKey --|> ApiKey
DefaultFunctionCallbackBuilder --> FunctionCallback
DefaultFunctionCallbackResolver --> FunctionCallbackResolver
DefaultFunctionCallingOptionsBuilder --> FunctionCallingOptions
FunctionInvokingFunctionCallback --> FunctionCallback
MethodInvokingFunctionCallback --> FunctionCallback
DefaultToolCallingManager --> ToolCallingManager
DefaultToolExecutionResult --> ToolExecutionResult
LegacyToolCallingManager --> ToolCallingManager

' 竖排布局
left to right direction
@enduml

@startuml
' 设置布局方向为垂直排列
left to right direction

' 定义主包
package org.springframework.ai.core.chat.client {
    interface ChatClient
    interface ChaClientCustimizer
    class DefaultChatClient
    class DefaultChatClientBuilder
    class package-info
    class ResponseEntity
}

' 定义 advisor 包及其子包
package org.springframework.ai.core.chat.client.advisor {
    class AbstractChatMemoryAdvisor
    class DefaultAroundAdvisorChain
    class LastMaxTokenSizeContentPurger
    class MessageChatMemoryAdvisor
    class package-info
    class PromptChatMemoryAdvisor
    class QuestionAnswerAdvisor
    class RetrievalAugmentationAdvisor
    class SafeGuardAdvisor
    class SimpleLoggerAdvisor
    class VectorStoreChatMemoryAdvisor

    ' 定义 advisor.api 子包
    package org.springframework.ai.core.chat.client.advisor.api {
        class AdvisedRequest
        class AdvisedResponse
        interface Advisor
        interface BaseAdvisor
        interface CallAroundAdvisor
        interface CallAroundAdvisorChain
        interface StreamAroundAdvisor
        interface StreamAroundAdvisorChain
        class package-info
    }

    ' 定义 advisor.observation 子包
    package org.springframework.ai.core.chat.client.advisor.observation {
        class AdvisorObservationContext
        interface AdvisorObservationConvention
        enum AdvisorObservationDocumentation
        class DefaultAdvisorObservationConvention
        class package-info
    }
}

' 定义 observation 包
package org.springframework.ai.core.chat.client.observation {
    class ChatClientInputContentObservationFilter
    class ChatClientObservationContext
    interface ChatClientObservationConvention
    enum ChatClientObservationDocumentation
    class DefaultChatClientObservationConvention
    class package-info
}

' 连接关系
org.springframework.ai.core.chat.client --> org.springframework.ai.core.chat.client.advisor : 使用
org.springframework.ai.core.chat.client --> org.springframework.ai.core.chat.client.observation : 使用
org.springframework.ai.core.chat.client.advisor --> org.springframework.ai.core.chat.client.advisor.api : 使用
org.springframework.ai.core.chat.client.advisor --> org.springframework.ai.core.chat.client.advisor.observation : 使用

' 显示包结构
show packages
@enduml
