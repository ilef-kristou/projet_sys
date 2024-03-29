package messaging;

import io.grpc.stub.AbstractStub;

public class MessagingServiceGrpc extends io.grpc.stub.AbstractStub<MessagingServiceGrpc> implements MessagingService {

    public MessagingServiceGrpc(io.grpc.Channel channel) {
        super(channel);
    }

    private MessagingServiceGrpc(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        super(channel, callOptions);
    }

    @Override
    protected MessagingServiceGrpc build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        return new MessagingServiceGrpc(channel, callOptions);
    }

    @Override
    public MessageResponse sendMessage(MessageRequest request) {
        return blockingUnaryCall(
                getChannel(),
                METHOD_SEND_MESSAGE,
                getCallOptions(),
                request);
    }

    @Override
    public MessageList getMessages(UserRequest request) {
        return blockingUnaryCall(
                getChannel(),
                METHOD_GET_MESSAGES,
                getCallOptions(),
                request);
    }
}