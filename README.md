# openshift-dashboard

As a cluster admin run:

oc project default

oc create serviceaccount dashboard

oc adm policy add-cluster-role-to-user cluster-admin system:serviceaccount:default:dashboard
