package com.twilio.proxy.common.sqs;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.regions.Region;
import com.amazonaws.services.sqs.*;
import com.amazonaws.services.sqs.model.AddPermissionRequest;
import com.amazonaws.services.sqs.model.AddPermissionResult;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequest;
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.DeleteMessageBatchResult;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.DeleteMessageResult;
import com.amazonaws.services.sqs.model.DeleteQueueRequest;
import com.amazonaws.services.sqs.model.DeleteQueueResult;
import com.amazonaws.services.sqs.model.GetQueueAttributesRequest;
import com.amazonaws.services.sqs.model.GetQueueAttributesResult;
import com.amazonaws.services.sqs.model.GetQueueUrlRequest;
import com.amazonaws.services.sqs.model.GetQueueUrlResult;
import com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest;
import com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult;
import com.amazonaws.services.sqs.model.ListQueueTagsRequest;
import com.amazonaws.services.sqs.model.ListQueueTagsResult;
import com.amazonaws.services.sqs.model.ListQueuesRequest;
import com.amazonaws.services.sqs.model.ListQueuesResult;
import com.amazonaws.services.sqs.model.PurgeQueueRequest;
import com.amazonaws.services.sqs.model.PurgeQueueResult;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.RemovePermissionRequest;
import com.amazonaws.services.sqs.model.RemovePermissionResult;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageBatchResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import com.amazonaws.services.sqs.model.SetQueueAttributesRequest;
import com.amazonaws.services.sqs.model.SetQueueAttributesResult;
import com.amazonaws.services.sqs.model.TagQueueRequest;
import com.amazonaws.services.sqs.model.TagQueueResult;
import com.amazonaws.services.sqs.model.UntagQueueRequest;
import com.amazonaws.services.sqs.model.UntagQueueResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NoOpAwsSqsClient implements AmazonSQS {

    @Override
    public void setEndpoint(String endpoint) {
        return;
    }

    @Override
    public void setRegion(Region region) {
        return;
    }

    @Override
    public AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest) {
        return new AddPermissionResult();
    }

    @Override
    public AddPermissionResult addPermission(String queueUrl, String label, List<String> aWSAccountIds,
                                             List<String> actions) {
        return new AddPermissionResult();
    }

    @Override
    public ChangeMessageVisibilityResult changeMessageVisibility(
            ChangeMessageVisibilityRequest changeMessageVisibilityRequest) {
        return new ChangeMessageVisibilityResult();
    }

    @Override
    public ChangeMessageVisibilityResult changeMessageVisibility(String queueUrl, String receiptHandle,
                                                                 Integer visibilityTimeout) {
        return new ChangeMessageVisibilityResult();
    }

    @Override
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) {
        return new ChangeMessageVisibilityBatchResult();
    }

    @Override
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(String queueUrl,
                                                                           List<ChangeMessageVisibilityBatchRequestEntry> entries) {
        return new ChangeMessageVisibilityBatchResult();
    }

    @Override
    public CreateQueueResult createQueue(CreateQueueRequest createQueueRequest) {
        return new CreateQueueResult();
    }

    @Override
    public CreateQueueResult createQueue(String queueName) {
        return new CreateQueueResult();
    }

    @Override
    public DeleteMessageResult deleteMessage(DeleteMessageRequest deleteMessageRequest) {
        return new DeleteMessageResult();
    }

    @Override
    public DeleteMessageResult deleteMessage(String queueUrl, String receiptHandle) {
        return new DeleteMessageResult();
    }

    @Override
    public DeleteMessageBatchResult deleteMessageBatch(DeleteMessageBatchRequest deleteMessageBatchRequest) {
        return new DeleteMessageBatchResult();
    }

    @Override
    public DeleteMessageBatchResult deleteMessageBatch(String queueUrl, List<DeleteMessageBatchRequestEntry> entries) {
        return new DeleteMessageBatchResult();
    }

    @Override
    public DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest) {
        return new DeleteQueueResult();
    }

    @Override
    public DeleteQueueResult deleteQueue(String queueUrl) {
        return new DeleteQueueResult();
    }

    @Override
    public GetQueueAttributesResult getQueueAttributes(GetQueueAttributesRequest getQueueAttributesRequest) {
        final GetQueueAttributesResult result =  new GetQueueAttributesResult();
        result.addAttributesEntry("ApproximateNumberOfMessages", "10");
        return result;
    }

    @Override
    public GetQueueAttributesResult getQueueAttributes(String queueUrl, List<String> attributeNames) {
        final GetQueueAttributesResult result =  new GetQueueAttributesResult();
        result.addAttributesEntry("ApproximateNumberOfMessages", "10");
        return result;
    }

    @Override
    public GetQueueUrlResult getQueueUrl(GetQueueUrlRequest getQueueUrlRequest) {
        return new GetQueueUrlResult();
    }

    @Override
    public GetQueueUrlResult getQueueUrl(String queueName) {
        GetQueueUrlResult result = new GetQueueUrlResult();
        result.setQueueUrl(queueName);
        return result;
    }

    @Override
    public ListDeadLetterSourceQueuesResult listDeadLetterSourceQueues(
            ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest) {
        return new ListDeadLetterSourceQueuesResult();
    }

    @Override
    public ListQueueTagsResult listQueueTags(ListQueueTagsRequest listQueueTagsRequest) {
        return new ListQueueTagsResult();
    }

    @Override
    public ListQueueTagsResult listQueueTags(String queueUrl) {
        return new ListQueueTagsResult();
    }

    @Override
    public ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest) {
        return new ListQueuesResult();
    }

    @Override
    public ListQueuesResult listQueues() {
        return new ListQueuesResult();
    }

    @Override
    public ListQueuesResult listQueues(String queueNamePrefix) {
        return new ListQueuesResult();
    }

    @Override
    public PurgeQueueResult purgeQueue(PurgeQueueRequest purgeQueueRequest) {
        return new PurgeQueueResult();
    }

    @Override
    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest receiveMessageRequest) {
        return new ReceiveMessageResult();
    }

    @Override
    public ReceiveMessageResult receiveMessage(String queueUrl) {
        return new ReceiveMessageResult();
    }

    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest) {
        return new RemovePermissionResult();
    }

    @Override
    public RemovePermissionResult removePermission(String queueUrl, String label) {
        return new RemovePermissionResult();
    }

    @Override
    public SendMessageResult sendMessage(SendMessageRequest sendMessageRequest) {
        return new SendMessageResult();
    }

    @Override
    public SendMessageResult sendMessage(String queueUrl, String messageBody) {
        return new SendMessageResult();
    }

    @Override
    public SendMessageBatchResult sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest) {
        return new SendMessageBatchResult();
    }

    @Override
    public SendMessageBatchResult sendMessageBatch(String queueUrl, List<SendMessageBatchRequestEntry> entries) {
        return new SendMessageBatchResult();
    }

    @Override
    public SetQueueAttributesResult setQueueAttributes(SetQueueAttributesRequest setQueueAttributesRequest) {
        return new SetQueueAttributesResult();
    }

    @Override
    public SetQueueAttributesResult setQueueAttributes(String queueUrl, Map<String, String> attributes) {
        return new SetQueueAttributesResult();
    }

    @Override
    public TagQueueResult tagQueue(TagQueueRequest tagQueueRequest) {
        return new TagQueueResult();
    }

    @Override
    public TagQueueResult tagQueue(String queueUrl, Map<String, String> tags) {
        return new TagQueueResult();
    }

    @Override
    public UntagQueueResult untagQueue(UntagQueueRequest untagQueueRequest) {
        return new UntagQueueResult();
    }

    @Override
    public UntagQueueResult untagQueue(String queueUrl, List<String> tagKeys) {
        return new UntagQueueResult();
    }

    @Override
    public void shutdown() {

    }

    @Override
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return new ResponseMetadata(new HashMap<String, String>());
    }
}
