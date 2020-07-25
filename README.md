# EventBus

## EventBus Definition
EventBus is an android library which lets you use the subscribe/publish pattern easily.

## Pub-Sub Pattern
Publish and Subcribe pattern is a messaging pattern in which subscribers register for a specific event to be dispatched from a publisher. It’s like a middleman between publisher and subscriber.
<img src="https://i.imgur.com/JD5FGig.png" width="800px" height="350px" />

## The Benefit
EventBus can decoupled class extensions. Imagine a case like this:

<img src="https://i.imgur.com/hVoRfnL.png" width="500px" height="500px" />

It will be hard to handle if we have a one-to-many relationship between parent and child activities or fragments.

## Implementation
`implementation 'org.greenrobot:eventbus:3.0.0'`

## Communicating Between Parent & Child Activity 
[DEMO](https://imgur.com/xl5ci05)
