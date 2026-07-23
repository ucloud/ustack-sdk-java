/**
 * Copyright 2026 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ucloudstack.client;

import com.ucloudstack.common.client.Client;
import com.ucloudstack.common.exception.OpenAPIException;
import com.ucloudstack.apis.BindAlertTemplateRequest;
import com.ucloudstack.apis.BindAlertTemplateResponse;
import com.ucloudstack.apis.CreateAlertNotifyGroupRequest;
import com.ucloudstack.apis.CreateAlertNotifyGroupResponse;
import com.ucloudstack.apis.CreateAlertNotifyReceiverRequest;
import com.ucloudstack.apis.CreateAlertNotifyReceiverResponse;
import com.ucloudstack.apis.CreateAlertNotifyWebhookRequest;
import com.ucloudstack.apis.CreateAlertNotifyWebhookResponse;
import com.ucloudstack.apis.CreateAlertTemplateRequest;
import com.ucloudstack.apis.CreateAlertTemplateResponse;
import com.ucloudstack.apis.CreateAlertTemplateRuleRequest;
import com.ucloudstack.apis.CreateAlertTemplateRuleResponse;
import com.ucloudstack.apis.CreateOPLogNotifyRuleRequest;
import com.ucloudstack.apis.CreateOPLogNotifyRuleResponse;
import com.ucloudstack.apis.CreateResourceEventNotifyRuleRequest;
import com.ucloudstack.apis.CreateResourceEventNotifyRuleResponse;
import com.ucloudstack.apis.DeleteAlertNotifyGroupRequest;
import com.ucloudstack.apis.DeleteAlertNotifyGroupResponse;
import com.ucloudstack.apis.DeleteAlertNotifyReceiverRequest;
import com.ucloudstack.apis.DeleteAlertNotifyReceiverResponse;
import com.ucloudstack.apis.DeleteAlertNotifyWebhookRequest;
import com.ucloudstack.apis.DeleteAlertNotifyWebhookResponse;
import com.ucloudstack.apis.DeleteAlertTemplateRequest;
import com.ucloudstack.apis.DeleteAlertTemplateResponse;
import com.ucloudstack.apis.DeleteAlertTemplateRuleRequest;
import com.ucloudstack.apis.DeleteAlertTemplateRuleResponse;
import com.ucloudstack.apis.DeleteOPLogNotifyRuleRequest;
import com.ucloudstack.apis.DeleteOPLogNotifyRuleResponse;
import com.ucloudstack.apis.DeleteResourceEventNotifyRuleRequest;
import com.ucloudstack.apis.DeleteResourceEventNotifyRuleResponse;
import com.ucloudstack.apis.DescribeAlertRequest;
import com.ucloudstack.apis.DescribeAlertResponse;
import com.ucloudstack.apis.DescribeAlertNotifyGroupRequest;
import com.ucloudstack.apis.DescribeAlertNotifyGroupResponse;
import com.ucloudstack.apis.DescribeAlertNotifyReceiverRequest;
import com.ucloudstack.apis.DescribeAlertNotifyReceiverResponse;
import com.ucloudstack.apis.DescribeAlertNotifyWebhookRequest;
import com.ucloudstack.apis.DescribeAlertNotifyWebhookResponse;
import com.ucloudstack.apis.DescribeAlertTemplateRequest;
import com.ucloudstack.apis.DescribeAlertTemplateResponse;
import com.ucloudstack.apis.DescribeAlertTemplateRuleRequest;
import com.ucloudstack.apis.DescribeAlertTemplateRuleResponse;
import com.ucloudstack.apis.DescribeAlertTemplateTargetRequest;
import com.ucloudstack.apis.DescribeAlertTemplateTargetResponse;
import com.ucloudstack.apis.DescribeMetricRequest;
import com.ucloudstack.apis.DescribeMetricResponse;
import com.ucloudstack.apis.DescribeOPLogNotifyRuleRequest;
import com.ucloudstack.apis.DescribeOPLogNotifyRuleResponse;
import com.ucloudstack.apis.DescribeResourceEventNotifyRuleRequest;
import com.ucloudstack.apis.DescribeResourceEventNotifyRuleResponse;
import com.ucloudstack.apis.OperateAlertRequest;
import com.ucloudstack.apis.OperateAlertResponse;
import com.ucloudstack.apis.PrometheusQueryRequest;
import com.ucloudstack.apis.PrometheusQueryResponse;
import com.ucloudstack.apis.PrometheusQueryRangeRequest;
import com.ucloudstack.apis.PrometheusQueryRangeResponse;
import com.ucloudstack.apis.UnbindAlertTemplateRequest;
import com.ucloudstack.apis.UnbindAlertTemplateResponse;
import com.ucloudstack.apis.UpdateAlertNotifyGroupRequest;
import com.ucloudstack.apis.UpdateAlertNotifyGroupResponse;
import com.ucloudstack.apis.UpdateAlertNotifyReceiverRequest;
import com.ucloudstack.apis.UpdateAlertNotifyReceiverResponse;
import com.ucloudstack.apis.UpdateAlertNotifyWebhookRequest;
import com.ucloudstack.apis.UpdateAlertNotifyWebhookResponse;
import com.ucloudstack.apis.UpdateAlertTemplateRequest;
import com.ucloudstack.apis.UpdateAlertTemplateResponse;
import com.ucloudstack.apis.UpdateAlertTemplateRuleRequest;
import com.ucloudstack.apis.UpdateAlertTemplateRuleResponse;
import com.ucloudstack.apis.UpdateOPLogNotifyRuleRequest;
import com.ucloudstack.apis.UpdateOPLogNotifyRuleResponse;
import com.ucloudstack.apis.UpdateResourceEventNotifyRuleRequest;
import com.ucloudstack.apis.UpdateResourceEventNotifyRuleResponse;
import com.ucloudstack.apis.AddASMemberRequest;
import com.ucloudstack.apis.AddASMemberResponse;
import com.ucloudstack.apis.AttachLoadBalancerRequest;
import com.ucloudstack.apis.AttachLoadBalancerResponse;
import com.ucloudstack.apis.CreateASGroupRequest;
import com.ucloudstack.apis.CreateASGroupResponse;
import com.ucloudstack.apis.DeleteASGroupRequest;
import com.ucloudstack.apis.DeleteASGroupResponse;
import com.ucloudstack.apis.DescribeASGroupRequest;
import com.ucloudstack.apis.DescribeASGroupResponse;
import com.ucloudstack.apis.DetachLoadBalancerRequest;
import com.ucloudstack.apis.DetachLoadBalancerResponse;
import com.ucloudstack.apis.DisableASGroupRequest;
import com.ucloudstack.apis.DisableASGroupResponse;
import com.ucloudstack.apis.EnableASGroupRequest;
import com.ucloudstack.apis.EnableASGroupResponse;
import com.ucloudstack.apis.RemoveASMemberRequest;
import com.ucloudstack.apis.RemoveASMemberResponse;
import com.ucloudstack.apis.UpdateASGroupRequest;
import com.ucloudstack.apis.UpdateASGroupResponse;
import com.ucloudstack.apis.DescribeBillDetailRequest;
import com.ucloudstack.apis.DescribeBillDetailResponse;
import com.ucloudstack.apis.DescribeBillOverViewRequest;
import com.ucloudstack.apis.DescribeBillOverViewResponse;
import com.ucloudstack.apis.DescribeBillResourceRequest;
import com.ucloudstack.apis.DescribeBillResourceResponse;
import com.ucloudstack.apis.DescribeOrderRequest;
import com.ucloudstack.apis.DescribeOrderResponse;
import com.ucloudstack.apis.DescribePriceRequest;
import com.ucloudstack.apis.DescribePriceResponse;
import com.ucloudstack.apis.DescribeRechargeRequest;
import com.ucloudstack.apis.DescribeRechargeResponse;
import com.ucloudstack.apis.DescribeTransactionRequest;
import com.ucloudstack.apis.DescribeTransactionResponse;
import com.ucloudstack.apis.DescribeWithdrawRequest;
import com.ucloudstack.apis.DescribeWithdrawResponse;
import com.ucloudstack.apis.GetRenewPriceRequest;
import com.ucloudstack.apis.GetRenewPriceResponse;
import com.ucloudstack.apis.GetWithdrawableAmountRequest;
import com.ucloudstack.apis.GetWithdrawableAmountResponse;
import com.ucloudstack.apis.RechargeRequest;
import com.ucloudstack.apis.RechargeResponse;
import com.ucloudstack.apis.RenewResourceRequest;
import com.ucloudstack.apis.RenewResourceResponse;
import com.ucloudstack.apis.UpdateDiscountRequest;
import com.ucloudstack.apis.UpdateDiscountResponse;
import com.ucloudstack.apis.UpdatePriceRequest;
import com.ucloudstack.apis.UpdatePriceResponse;
import com.ucloudstack.apis.WithdrawRequest;
import com.ucloudstack.apis.WithdrawResponse;
import com.ucloudstack.apis.CreateBucketRequest;
import com.ucloudstack.apis.CreateBucketResponse;
import com.ucloudstack.apis.CreateBucketLifecycleRuleRequest;
import com.ucloudstack.apis.CreateBucketLifecycleRuleResponse;
import com.ucloudstack.apis.CreateDOSTokenRequest;
import com.ucloudstack.apis.CreateDOSTokenResponse;
import com.ucloudstack.apis.DOSLoginRequest;
import com.ucloudstack.apis.DOSLoginResponse;
import com.ucloudstack.apis.DeleteBucketRequest;
import com.ucloudstack.apis.DeleteBucketResponse;
import com.ucloudstack.apis.DeleteBucketLifecycleRuleRequest;
import com.ucloudstack.apis.DeleteBucketLifecycleRuleResponse;
import com.ucloudstack.apis.DeleteDOSTokenRequest;
import com.ucloudstack.apis.DeleteDOSTokenResponse;
import com.ucloudstack.apis.DescribeBucketLifecycleRulesRequest;
import com.ucloudstack.apis.DescribeBucketLifecycleRulesResponse;
import com.ucloudstack.apis.DescribeBucketsRequest;
import com.ucloudstack.apis.DescribeBucketsResponse;
import com.ucloudstack.apis.DescribeDOSTokenRequest;
import com.ucloudstack.apis.DescribeDOSTokenResponse;
import com.ucloudstack.apis.FlushBucketRequest;
import com.ucloudstack.apis.FlushBucketResponse;
import com.ucloudstack.apis.UpdateBucketAccessTypeRequest;
import com.ucloudstack.apis.UpdateBucketAccessTypeResponse;
import com.ucloudstack.apis.UpdateBucketEventLoggingRequest;
import com.ucloudstack.apis.UpdateBucketEventLoggingResponse;
import com.ucloudstack.apis.UpdateBucketLifecycleRuleRequest;
import com.ucloudstack.apis.UpdateBucketLifecycleRuleResponse;
import com.ucloudstack.apis.UpdateBucketObjectLockRequest;
import com.ucloudstack.apis.UpdateBucketObjectLockResponse;
import com.ucloudstack.apis.UpdateBucketQuotaRequest;
import com.ucloudstack.apis.UpdateBucketQuotaResponse;
import com.ucloudstack.apis.UpdateBucketVersioningRequest;
import com.ucloudstack.apis.UpdateBucketVersioningResponse;
import com.ucloudstack.apis.UpdateDOSTokenRequest;
import com.ucloudstack.apis.UpdateDOSTokenResponse;
import com.ucloudstack.apis.CreateUserRequest;
import com.ucloudstack.apis.CreateUserResponse;
import com.ucloudstack.apis.DeleteCompanyRequest;
import com.ucloudstack.apis.DeleteCompanyResponse;
import com.ucloudstack.apis.DescribeLoginWhitelistRequest;
import com.ucloudstack.apis.DescribeLoginWhitelistResponse;
import com.ucloudstack.apis.DescribeTenantResourcesRequest;
import com.ucloudstack.apis.DescribeTenantResourcesResponse;
import com.ucloudstack.apis.DescribeUserRequest;
import com.ucloudstack.apis.DescribeUserResponse;
import com.ucloudstack.apis.FreezeUserRequest;
import com.ucloudstack.apis.FreezeUserResponse;
import com.ucloudstack.apis.RenameCompanyRequest;
import com.ucloudstack.apis.RenameCompanyResponse;
import com.ucloudstack.apis.UnFreezeUserRequest;
import com.ucloudstack.apis.UnFreezeUserResponse;
import com.ucloudstack.apis.UpdateCompanyEmailRequest;
import com.ucloudstack.apis.UpdateCompanyEmailResponse;
import com.ucloudstack.apis.UpdateCompanyNameRequest;
import com.ucloudstack.apis.UpdateCompanyNameResponse;
import com.ucloudstack.apis.UpdateLoginWhitelistRequest;
import com.ucloudstack.apis.UpdateLoginWhitelistResponse;
import com.ucloudstack.apis.CreateProductSpecificationRequest;
import com.ucloudstack.apis.CreateProductSpecificationResponse;
import com.ucloudstack.apis.DeleteProductSpecificationRequest;
import com.ucloudstack.apis.DeleteProductSpecificationResponse;
import com.ucloudstack.apis.DescribeProductSpecificationRequest;
import com.ucloudstack.apis.DescribeProductSpecificationResponse;
import com.ucloudstack.apis.DescribeProductSpecificationTemplateRequest;
import com.ucloudstack.apis.DescribeProductSpecificationTemplateResponse;
import com.ucloudstack.apis.DescribeQuotaRequest;
import com.ucloudstack.apis.DescribeQuotaResponse;
import com.ucloudstack.apis.DescribeQuotaUsageRequest;
import com.ucloudstack.apis.DescribeQuotaUsageResponse;
import com.ucloudstack.apis.DescribeResourceInfoRequest;
import com.ucloudstack.apis.DescribeResourceInfoResponse;
import com.ucloudstack.apis.DescribeSetAllocateUsageRequest;
import com.ucloudstack.apis.DescribeSetAllocateUsageResponse;
import com.ucloudstack.apis.GetConfigRequest;
import com.ucloudstack.apis.GetConfigResponse;
import com.ucloudstack.apis.GetFilterKeywordsRequest;
import com.ucloudstack.apis.GetFilterKeywordsResponse;
import com.ucloudstack.apis.GetRegionConfigRequest;
import com.ucloudstack.apis.GetRegionConfigResponse;
import com.ucloudstack.apis.GetSSOConfigRequest;
import com.ucloudstack.apis.GetSSOConfigResponse;
import com.ucloudstack.apis.ListGlobalConfigsRequest;
import com.ucloudstack.apis.ListGlobalConfigsResponse;
import com.ucloudstack.apis.ListRegionConfigSyncStatusRequest;
import com.ucloudstack.apis.ListRegionConfigSyncStatusResponse;
import com.ucloudstack.apis.ListRegionConfigsRequest;
import com.ucloudstack.apis.ListRegionConfigsResponse;
import com.ucloudstack.apis.SetAccountQuotaRequest;
import com.ucloudstack.apis.SetAccountQuotaResponse;
import com.ucloudstack.apis.UpdateConfigRequest;
import com.ucloudstack.apis.UpdateConfigResponse;
import com.ucloudstack.apis.UpdateProductSpecificationRequest;
import com.ucloudstack.apis.UpdateProductSpecificationResponse;
import com.ucloudstack.apis.UpdateRegionConfigRequest;
import com.ucloudstack.apis.UpdateRegionConfigResponse;
import com.ucloudstack.apis.VerifyEmailAvailabilityRequest;
import com.ucloudstack.apis.VerifyEmailAvailabilityResponse;
import com.ucloudstack.apis.CreateContainerImageRepositoryRequest;
import com.ucloudstack.apis.CreateContainerImageRepositoryResponse;
import com.ucloudstack.apis.DeleteContainerImageRequest;
import com.ucloudstack.apis.DeleteContainerImageResponse;
import com.ucloudstack.apis.DeleteContainerImageRepositoryRequest;
import com.ucloudstack.apis.DeleteContainerImageRepositoryResponse;
import com.ucloudstack.apis.DeleteContainerImageTagRequest;
import com.ucloudstack.apis.DeleteContainerImageTagResponse;
import com.ucloudstack.apis.DescribeContainerImageRequest;
import com.ucloudstack.apis.DescribeContainerImageResponse;
import com.ucloudstack.apis.DescribeContainerImageRepositoryRequest;
import com.ucloudstack.apis.DescribeContainerImageRepositoryResponse;
import com.ucloudstack.apis.DescribeContainerImageTagRequest;
import com.ucloudstack.apis.DescribeContainerImageTagResponse;
import com.ucloudstack.apis.UpdateContainerImageRepositoryRequest;
import com.ucloudstack.apis.UpdateContainerImageRepositoryResponse;
import com.ucloudstack.apis.BindStorageToDBSRequest;
import com.ucloudstack.apis.BindStorageToDBSResponse;
import com.ucloudstack.apis.ChangeDBSGatewayEIPRequest;
import com.ucloudstack.apis.ChangeDBSGatewayEIPResponse;
import com.ucloudstack.apis.CreateDBSBackupPlanRequest;
import com.ucloudstack.apis.CreateDBSBackupPlanResponse;
import com.ucloudstack.apis.CreateDBSGatewayRequest;
import com.ucloudstack.apis.CreateDBSGatewayResponse;
import com.ucloudstack.apis.DeleteDBSBackupRequest;
import com.ucloudstack.apis.DeleteDBSBackupResponse;
import com.ucloudstack.apis.DeleteDBSBackupPlanRequest;
import com.ucloudstack.apis.DeleteDBSBackupPlanResponse;
import com.ucloudstack.apis.DeleteDBSGatewayRequest;
import com.ucloudstack.apis.DeleteDBSGatewayResponse;
import com.ucloudstack.apis.DescribeDBSBackupRequest;
import com.ucloudstack.apis.DescribeDBSBackupResponse;
import com.ucloudstack.apis.DescribeDBSBackupPlanRequest;
import com.ucloudstack.apis.DescribeDBSBackupPlanResponse;
import com.ucloudstack.apis.DescribeDBSGatewayRequest;
import com.ucloudstack.apis.DescribeDBSGatewayResponse;
import com.ucloudstack.apis.DescribeDBSRestoreRangeInfoRequest;
import com.ucloudstack.apis.DescribeDBSRestoreRangeInfoResponse;
import com.ucloudstack.apis.DescribeDBSStorageRequest;
import com.ucloudstack.apis.DescribeDBSStorageResponse;
import com.ucloudstack.apis.ExecDBSBackupPlanRequest;
import com.ucloudstack.apis.ExecDBSBackupPlanResponse;
import com.ucloudstack.apis.PauseDBSBackupRequest;
import com.ucloudstack.apis.PauseDBSBackupResponse;
import com.ucloudstack.apis.ResumeDBSBackupRequest;
import com.ucloudstack.apis.ResumeDBSBackupResponse;
import com.ucloudstack.apis.UnbindStorageFromDBSRequest;
import com.ucloudstack.apis.UnbindStorageFromDBSResponse;
import com.ucloudstack.apis.UpdateDBSBackupPlanRequest;
import com.ucloudstack.apis.UpdateDBSBackupPlanResponse;
import com.ucloudstack.apis.UpdateDBSBackupPlanSimpleRequest;
import com.ucloudstack.apis.UpdateDBSBackupPlanSimpleResponse;
import com.ucloudstack.apis.UpdateDBSStorageRequest;
import com.ucloudstack.apis.UpdateDBSStorageResponse;
import com.ucloudstack.apis.AttachDiskRequest;
import com.ucloudstack.apis.AttachDiskResponse;
import com.ucloudstack.apis.AttachISORequest;
import com.ucloudstack.apis.AttachISOResponse;
import com.ucloudstack.apis.CloneDiskRequest;
import com.ucloudstack.apis.CloneDiskResponse;
import com.ucloudstack.apis.CreateDiskRequest;
import com.ucloudstack.apis.CreateDiskResponse;
import com.ucloudstack.apis.CreateDiskFromSnapshotRequest;
import com.ucloudstack.apis.CreateDiskFromSnapshotResponse;
import com.ucloudstack.apis.DeleteDiskRequest;
import com.ucloudstack.apis.DeleteDiskResponse;
import com.ucloudstack.apis.DescribeDiskRequest;
import com.ucloudstack.apis.DescribeDiskResponse;
import com.ucloudstack.apis.DescribeVMISORequest;
import com.ucloudstack.apis.DescribeVMISOResponse;
import com.ucloudstack.apis.DetachDiskRequest;
import com.ucloudstack.apis.DetachDiskResponse;
import com.ucloudstack.apis.DetachISORequest;
import com.ucloudstack.apis.DetachISOResponse;
import com.ucloudstack.apis.GetCreateDiskPriceRequest;
import com.ucloudstack.apis.GetCreateDiskPriceResponse;
import com.ucloudstack.apis.GetDiskPriceRequest;
import com.ucloudstack.apis.GetDiskPriceResponse;
import com.ucloudstack.apis.GetUpgradeDiskPriceRequest;
import com.ucloudstack.apis.GetUpgradeDiskPriceResponse;
import com.ucloudstack.apis.UpdateDiskQoSRequest;
import com.ucloudstack.apis.UpdateDiskQoSResponse;
import com.ucloudstack.apis.UpgradeDiskRequest;
import com.ucloudstack.apis.UpgradeDiskResponse;
import com.ucloudstack.apis.CreateSnapshotRequest;
import com.ucloudstack.apis.CreateSnapshotResponse;
import com.ucloudstack.apis.DeleteSnapshotRequest;
import com.ucloudstack.apis.DeleteSnapshotResponse;
import com.ucloudstack.apis.DescribeSnapshotRequest;
import com.ucloudstack.apis.DescribeSnapshotResponse;
import com.ucloudstack.apis.RollbackSnapshotRequest;
import com.ucloudstack.apis.RollbackSnapshotResponse;
import com.ucloudstack.apis.DeleteComputeClassDRSRequest;
import com.ucloudstack.apis.DeleteComputeClassDRSResponse;
import com.ucloudstack.apis.DescribeComputeClassDRSRequest;
import com.ucloudstack.apis.DescribeComputeClassDRSResponse;
import com.ucloudstack.apis.DescribeComputeClassDRSRecordsRequest;
import com.ucloudstack.apis.DescribeComputeClassDRSRecordsResponse;
import com.ucloudstack.apis.DescribeComputeClassDRSScoreRequest;
import com.ucloudstack.apis.DescribeComputeClassDRSScoreResponse;
import com.ucloudstack.apis.DescribeComputeClassDRSSuggestionsRequest;
import com.ucloudstack.apis.DescribeComputeClassDRSSuggestionsResponse;
import com.ucloudstack.apis.DescribeComputeClassVMsAddToDRSRuleRequest;
import com.ucloudstack.apis.DescribeComputeClassVMsAddToDRSRuleResponse;
import com.ucloudstack.apis.SetComputeClassDRSRequest;
import com.ucloudstack.apis.SetComputeClassDRSResponse;
import com.ucloudstack.apis.SetComputeClassDRSSuspendRequest;
import com.ucloudstack.apis.SetComputeClassDRSSuspendResponse;
import com.ucloudstack.apis.SetComputeClassDRSVMRuleRequest;
import com.ucloudstack.apis.SetComputeClassDRSVMRuleResponse;
import com.ucloudstack.apis.TriggerDRSOnceRequest;
import com.ucloudstack.apis.TriggerDRSOnceResponse;
import com.ucloudstack.apis.CreateDTSTaskRequest;
import com.ucloudstack.apis.CreateDTSTaskResponse;
import com.ucloudstack.apis.CreateDataCheckTaskRequest;
import com.ucloudstack.apis.CreateDataCheckTaskResponse;
import com.ucloudstack.apis.DeleteDTSTaskRequest;
import com.ucloudstack.apis.DeleteDTSTaskResponse;
import com.ucloudstack.apis.DescribeDTSLogRequest;
import com.ucloudstack.apis.DescribeDTSLogResponse;
import com.ucloudstack.apis.DescribeDTSTaskRequest;
import com.ucloudstack.apis.DescribeDTSTaskResponse;
import com.ucloudstack.apis.DescribeDataCheckTaskRequest;
import com.ucloudstack.apis.DescribeDataCheckTaskResponse;
import com.ucloudstack.apis.GetDTSPriceRequest;
import com.ucloudstack.apis.GetDTSPriceResponse;
import com.ucloudstack.apis.GetDTSTaskConfigureRequest;
import com.ucloudstack.apis.GetDTSTaskConfigureResponse;
import com.ucloudstack.apis.GetDataCheckTaskResultRequest;
import com.ucloudstack.apis.GetDataCheckTaskResultResponse;
import com.ucloudstack.apis.RunDTSPrecheckRequest;
import com.ucloudstack.apis.RunDTSPrecheckResponse;
import com.ucloudstack.apis.StartDTSTaskRequest;
import com.ucloudstack.apis.StartDTSTaskResponse;
import com.ucloudstack.apis.SuspendDTSTaskRequest;
import com.ucloudstack.apis.SuspendDTSTaskResponse;
import com.ucloudstack.apis.UpdateDTSInstanceSpecRequest;
import com.ucloudstack.apis.UpdateDTSInstanceSpecResponse;
import com.ucloudstack.apis.UpdateDTSTaskConfigureRequest;
import com.ucloudstack.apis.UpdateDTSTaskConfigureResponse;
import com.ucloudstack.apis.CreateFlatNetworkRequest;
import com.ucloudstack.apis.CreateFlatNetworkResponse;
import com.ucloudstack.apis.CreateFlatNetworkRouteRequest;
import com.ucloudstack.apis.CreateFlatNetworkRouteResponse;
import com.ucloudstack.apis.DeleteFlatNetworkRequest;
import com.ucloudstack.apis.DeleteFlatNetworkResponse;
import com.ucloudstack.apis.DeleteFlatNetworkRouteRequest;
import com.ucloudstack.apis.DeleteFlatNetworkRouteResponse;
import com.ucloudstack.apis.DescribeFlatNetworkRequest;
import com.ucloudstack.apis.DescribeFlatNetworkResponse;
import com.ucloudstack.apis.DescribeFlatNetworkRouteRequest;
import com.ucloudstack.apis.DescribeFlatNetworkRouteResponse;
import com.ucloudstack.apis.UpdateFlatNetworkRequest;
import com.ucloudstack.apis.UpdateFlatNetworkResponse;
import com.ucloudstack.apis.UpdateFlatNetworkRouteRequest;
import com.ucloudstack.apis.UpdateFlatNetworkRouteResponse;
import com.ucloudstack.apis.CreateFSRequest;
import com.ucloudstack.apis.CreateFSResponse;
import com.ucloudstack.apis.CreateFSDirRequest;
import com.ucloudstack.apis.CreateFSDirResponse;
import com.ucloudstack.apis.DeleteFSRequest;
import com.ucloudstack.apis.DeleteFSResponse;
import com.ucloudstack.apis.DeleteFSFileRequest;
import com.ucloudstack.apis.DeleteFSFileResponse;
import com.ucloudstack.apis.DescribeFSRequest;
import com.ucloudstack.apis.DescribeFSResponse;
import com.ucloudstack.apis.DescribeFSFileRequest;
import com.ucloudstack.apis.DescribeFSFileResponse;
import com.ucloudstack.apis.FSLoginRequest;
import com.ucloudstack.apis.FSLoginResponse;
import com.ucloudstack.apis.GetFSPriceRequest;
import com.ucloudstack.apis.GetFSPriceResponse;
import com.ucloudstack.apis.UpgradeFSRequest;
import com.ucloudstack.apis.UpgradeFSResponse;
import com.ucloudstack.apis.AbortMigrateVMInstanceRequest;
import com.ucloudstack.apis.AbortMigrateVMInstanceResponse;
import com.ucloudstack.apis.CloseHostNUMAScheduleRequest;
import com.ucloudstack.apis.CloseHostNUMAScheduleResponse;
import com.ucloudstack.apis.DescribeHostPodsRequest;
import com.ucloudstack.apis.DescribeHostPodsResponse;
import com.ucloudstack.apis.DescribeHostVMInstanceRequest;
import com.ucloudstack.apis.DescribeHostVMInstanceResponse;
import com.ucloudstack.apis.DescribeNodeRequest;
import com.ucloudstack.apis.DescribeNodeResponse;
import com.ucloudstack.apis.DescribeNodeNUMAInfoRequest;
import com.ucloudstack.apis.DescribeNodeNUMAInfoResponse;
import com.ucloudstack.apis.DescribeVMHostRequest;
import com.ucloudstack.apis.DescribeVMHostResponse;
import com.ucloudstack.apis.DiskLightOffRequest;
import com.ucloudstack.apis.DiskLightOffResponse;
import com.ucloudstack.apis.DiskLightOnRequest;
import com.ucloudstack.apis.DiskLightOnResponse;
import com.ucloudstack.apis.GetNodeCPUGovernorRequest;
import com.ucloudstack.apis.GetNodeCPUGovernorResponse;
import com.ucloudstack.apis.ListGPUsRequest;
import com.ucloudstack.apis.ListGPUsResponse;
import com.ucloudstack.apis.LockHostRequest;
import com.ucloudstack.apis.LockHostResponse;
import com.ucloudstack.apis.MigrateVMInstanceRequest;
import com.ucloudstack.apis.MigrateVMInstanceResponse;
import com.ucloudstack.apis.OpenHostNUMAScheduleRequest;
import com.ucloudstack.apis.OpenHostNUMAScheduleResponse;
import com.ucloudstack.apis.UnlockHostRequest;
import com.ucloudstack.apis.UnlockHostResponse;
import com.ucloudstack.apis.UpdateNodeCPUGovernorRequest;
import com.ucloudstack.apis.UpdateNodeCPUGovernorResponse;
import com.ucloudstack.apis.UpdateVFLogicCountRequest;
import com.ucloudstack.apis.UpdateVFLogicCountResponse;
import com.ucloudstack.apis.AllocateNodeHostDeviceRequest;
import com.ucloudstack.apis.AllocateNodeHostDeviceResponse;
import com.ucloudstack.apis.CreateNodeHostDeviceRequest;
import com.ucloudstack.apis.CreateNodeHostDeviceResponse;
import com.ucloudstack.apis.DeleteNodeHostDeviceRequest;
import com.ucloudstack.apis.DeleteNodeHostDeviceResponse;
import com.ucloudstack.apis.DescribeNodeHostDeviceRequest;
import com.ucloudstack.apis.DescribeNodeHostDeviceResponse;
import com.ucloudstack.apis.AbortCustomImageRequest;
import com.ucloudstack.apis.AbortCustomImageResponse;
import com.ucloudstack.apis.AbortImageMultipartUploadRequest;
import com.ucloudstack.apis.AbortImageMultipartUploadResponse;
import com.ucloudstack.apis.CloneCustomImageToBaseImageRequest;
import com.ucloudstack.apis.CloneCustomImageToBaseImageResponse;
import com.ucloudstack.apis.CompleteImageMultipartUploadRequest;
import com.ucloudstack.apis.CompleteImageMultipartUploadResponse;
import com.ucloudstack.apis.CreateCustomImageRequest;
import com.ucloudstack.apis.CreateCustomImageResponse;
import com.ucloudstack.apis.DeleteBaseImageRequest;
import com.ucloudstack.apis.DeleteBaseImageResponse;
import com.ucloudstack.apis.DeleteCustomImageRequest;
import com.ucloudstack.apis.DeleteCustomImageResponse;
import com.ucloudstack.apis.DescribeBaseImageRequest;
import com.ucloudstack.apis.DescribeBaseImageResponse;
import com.ucloudstack.apis.DescribeImageRequest;
import com.ucloudstack.apis.DescribeImageResponse;
import com.ucloudstack.apis.DescribeImageOSVersionsRequest;
import com.ucloudstack.apis.DescribeImageOSVersionsResponse;
import com.ucloudstack.apis.GetImageDownloadURLRequest;
import com.ucloudstack.apis.GetImageDownloadURLResponse;
import com.ucloudstack.apis.ImportImageRequest;
import com.ucloudstack.apis.ImportImageResponse;
import com.ucloudstack.apis.UpdateImageRequest;
import com.ucloudstack.apis.UpdateImageResponse;
import com.ucloudstack.apis.CountTenantResourceByStatusRequest;
import com.ucloudstack.apis.CountTenantResourceByStatusResponse;
import com.ucloudstack.apis.CreateOnSiteInspectionRequest;
import com.ucloudstack.apis.CreateOnSiteInspectionResponse;
import com.ucloudstack.apis.CreateResourceUsageRequest;
import com.ucloudstack.apis.CreateResourceUsageResponse;
import com.ucloudstack.apis.DeleteOnSiteInspectionRequest;
import com.ucloudstack.apis.DeleteOnSiteInspectionResponse;
import com.ucloudstack.apis.DeleteResourceUsageRequest;
import com.ucloudstack.apis.DeleteResourceUsageResponse;
import com.ucloudstack.apis.DescribeNetworkTopologyRequest;
import com.ucloudstack.apis.DescribeNetworkTopologyResponse;
import com.ucloudstack.apis.DescribeResourceChartRequest;
import com.ucloudstack.apis.DescribeResourceChartResponse;
import com.ucloudstack.apis.DescribeResourceConditionRequest;
import com.ucloudstack.apis.DescribeResourceConditionResponse;
import com.ucloudstack.apis.DescribeResourceEventRequest;
import com.ucloudstack.apis.DescribeResourceEventResponse;
import com.ucloudstack.apis.GetOnSiteInspectionRequest;
import com.ucloudstack.apis.GetOnSiteInspectionResponse;
import com.ucloudstack.apis.GetResourceUsageRequest;
import com.ucloudstack.apis.GetResourceUsageResponse;
import com.ucloudstack.apis.ListExpiredResourcesRequest;
import com.ucloudstack.apis.ListExpiredResourcesResponse;
import com.ucloudstack.apis.ListOnSiteInspectionsRequest;
import com.ucloudstack.apis.ListOnSiteInspectionsResponse;
import com.ucloudstack.apis.ListResourceUsagesRequest;
import com.ucloudstack.apis.ListResourceUsagesResponse;
import com.ucloudstack.apis.RetryResourceUsageRequest;
import com.ucloudstack.apis.RetryResourceUsageResponse;
import com.ucloudstack.apis.AllocateEIPRequest;
import com.ucloudstack.apis.AllocateEIPResponse;
import com.ucloudstack.apis.BindEIPRequest;
import com.ucloudstack.apis.BindEIPResponse;
import com.ucloudstack.apis.CheckIPInuseRequest;
import com.ucloudstack.apis.CheckIPInuseResponse;
import com.ucloudstack.apis.DescribeEIPRequest;
import com.ucloudstack.apis.DescribeEIPResponse;
import com.ucloudstack.apis.GetEIPDiffPriceRequest;
import com.ucloudstack.apis.GetEIPDiffPriceResponse;
import com.ucloudstack.apis.GetEIPPriceRequest;
import com.ucloudstack.apis.GetEIPPriceResponse;
import com.ucloudstack.apis.ModifyEIPBandwidthRequest;
import com.ucloudstack.apis.ModifyEIPBandwidthResponse;
import com.ucloudstack.apis.ReleaseEIPRequest;
import com.ucloudstack.apis.ReleaseEIPResponse;
import com.ucloudstack.apis.UnBindEIPRequest;
import com.ucloudstack.apis.UnBindEIPResponse;
import com.ucloudstack.apis.AddNodesToIsolationGroupRequest;
import com.ucloudstack.apis.AddNodesToIsolationGroupResponse;
import com.ucloudstack.apis.AddVMToIsolationGroupRequest;
import com.ucloudstack.apis.AddVMToIsolationGroupResponse;
import com.ucloudstack.apis.CreateIsolationGroupRequest;
import com.ucloudstack.apis.CreateIsolationGroupResponse;
import com.ucloudstack.apis.DeleteIsolationGroupRequest;
import com.ucloudstack.apis.DeleteIsolationGroupResponse;
import com.ucloudstack.apis.DescribeIsolationGroupsRequest;
import com.ucloudstack.apis.DescribeIsolationGroupsResponse;
import com.ucloudstack.apis.DescribeVMAddToVMGroupRequest;
import com.ucloudstack.apis.DescribeVMAddToVMGroupResponse;
import com.ucloudstack.apis.RemoveNodesFromIsolationGroupRequest;
import com.ucloudstack.apis.RemoveNodesFromIsolationGroupResponse;
import com.ucloudstack.apis.RemoveVMFromIsolationGroupRequest;
import com.ucloudstack.apis.RemoveVMFromIsolationGroupResponse;
import com.ucloudstack.apis.UpdateIsolationGroupRequest;
import com.ucloudstack.apis.UpdateIsolationGroupResponse;
import com.ucloudstack.apis.AllocateK8SSessionRequest;
import com.ucloudstack.apis.AllocateK8SSessionResponse;
import com.ucloudstack.apis.AllocateK8STerminalRequest;
import com.ucloudstack.apis.AllocateK8STerminalResponse;
import com.ucloudstack.apis.AllocateNativeNodeSSHSessionRequest;
import com.ucloudstack.apis.AllocateNativeNodeSSHSessionResponse;
import com.ucloudstack.apis.AllocateNativeNodeVNCSessionRequest;
import com.ucloudstack.apis.AllocateNativeNodeVNCSessionResponse;
import com.ucloudstack.apis.AttachClusterEIPRequest;
import com.ucloudstack.apis.AttachClusterEIPResponse;
import com.ucloudstack.apis.CreateClusterRequest;
import com.ucloudstack.apis.CreateClusterResponse;
import com.ucloudstack.apis.CreateNativeNodeRequest;
import com.ucloudstack.apis.CreateNativeNodeResponse;
import com.ucloudstack.apis.DeleteClusterRequest;
import com.ucloudstack.apis.DeleteClusterResponse;
import com.ucloudstack.apis.DeleteNativeNodeRequest;
import com.ucloudstack.apis.DeleteNativeNodeResponse;
import com.ucloudstack.apis.DescribeClusterRequest;
import com.ucloudstack.apis.DescribeClusterResponse;
import com.ucloudstack.apis.DescribeNativeNodeRequest;
import com.ucloudstack.apis.DescribeNativeNodeResponse;
import com.ucloudstack.apis.DetachClusterEIPRequest;
import com.ucloudstack.apis.DetachClusterEIPResponse;
import com.ucloudstack.apis.ForwardClusterRequest;
import com.ucloudstack.apis.ForwardClusterResponse;
import com.ucloudstack.apis.GetClusterPaymentOfPremiumRequest;
import com.ucloudstack.apis.GetClusterPaymentOfPremiumResponse;
import com.ucloudstack.apis.GetClusterPriceRequest;
import com.ucloudstack.apis.GetClusterPriceResponse;
import com.ucloudstack.apis.GetContainerLogsRequest;
import com.ucloudstack.apis.GetContainerLogsResponse;
import com.ucloudstack.apis.GetNativeNodePriceRequest;
import com.ucloudstack.apis.GetNativeNodePriceResponse;
import com.ucloudstack.apis.UpdateClusterRequest;
import com.ucloudstack.apis.UpdateClusterResponse;
import com.ucloudstack.apis.UpdateClusterCapacityRequest;
import com.ucloudstack.apis.UpdateClusterCapacityResponse;
import com.ucloudstack.apis.UpdateNativeNodeInstanceStatusRequest;
import com.ucloudstack.apis.UpdateNativeNodeInstanceStatusResponse;
import com.ucloudstack.apis.UpdateNativeNodeWANRequest;
import com.ucloudstack.apis.UpdateNativeNodeWANResponse;
import com.ucloudstack.apis.BindEIPToLBRequest;
import com.ucloudstack.apis.BindEIPToLBResponse;
import com.ucloudstack.apis.CreateCertificateRequest;
import com.ucloudstack.apis.CreateCertificateResponse;
import com.ucloudstack.apis.CreateLBRequest;
import com.ucloudstack.apis.CreateLBResponse;
import com.ucloudstack.apis.CreateRSRequest;
import com.ucloudstack.apis.CreateRSResponse;
import com.ucloudstack.apis.CreateVSRequest;
import com.ucloudstack.apis.CreateVSResponse;
import com.ucloudstack.apis.CreateVSPolicyRequest;
import com.ucloudstack.apis.CreateVSPolicyResponse;
import com.ucloudstack.apis.DeleteCertificateRequest;
import com.ucloudstack.apis.DeleteCertificateResponse;
import com.ucloudstack.apis.DeleteLBRequest;
import com.ucloudstack.apis.DeleteLBResponse;
import com.ucloudstack.apis.DeleteRSRequest;
import com.ucloudstack.apis.DeleteRSResponse;
import com.ucloudstack.apis.DeleteVSRequest;
import com.ucloudstack.apis.DeleteVSResponse;
import com.ucloudstack.apis.DeleteVSPolicyRequest;
import com.ucloudstack.apis.DeleteVSPolicyResponse;
import com.ucloudstack.apis.DescribeCertificateRequest;
import com.ucloudstack.apis.DescribeCertificateResponse;
import com.ucloudstack.apis.DescribeLBRequest;
import com.ucloudstack.apis.DescribeLBResponse;
import com.ucloudstack.apis.DescribeRSRequest;
import com.ucloudstack.apis.DescribeRSResponse;
import com.ucloudstack.apis.DescribeVSRequest;
import com.ucloudstack.apis.DescribeVSResponse;
import com.ucloudstack.apis.DescribeVSPolicyRequest;
import com.ucloudstack.apis.DescribeVSPolicyResponse;
import com.ucloudstack.apis.DisableRSRequest;
import com.ucloudstack.apis.DisableRSResponse;
import com.ucloudstack.apis.DowngradeLBRequest;
import com.ucloudstack.apis.DowngradeLBResponse;
import com.ucloudstack.apis.EnableRSRequest;
import com.ucloudstack.apis.EnableRSResponse;
import com.ucloudstack.apis.GetLBPriceRequest;
import com.ucloudstack.apis.GetLBPriceResponse;
import com.ucloudstack.apis.UnbindEIPFromLBRequest;
import com.ucloudstack.apis.UnbindEIPFromLBResponse;
import com.ucloudstack.apis.UpdateLBAccessLogForLiveRequest;
import com.ucloudstack.apis.UpdateLBAccessLogForLiveResponse;
import com.ucloudstack.apis.UpdateLBLogRequest;
import com.ucloudstack.apis.UpdateLBLogResponse;
import com.ucloudstack.apis.UpdateRSRequest;
import com.ucloudstack.apis.UpdateRSResponse;
import com.ucloudstack.apis.UpdateSGFromLBRequest;
import com.ucloudstack.apis.UpdateSGFromLBResponse;
import com.ucloudstack.apis.UpdateVSRequest;
import com.ucloudstack.apis.UpdateVSResponse;
import com.ucloudstack.apis.UpdateVSPolicyRequest;
import com.ucloudstack.apis.UpdateVSPolicyResponse;
import com.ucloudstack.apis.UpgradeLBRequest;
import com.ucloudstack.apis.UpgradeLBResponse;
import com.ucloudstack.apis.UpgradeLBToHARequest;
import com.ucloudstack.apis.UpgradeLBToHAResponse;
import com.ucloudstack.apis.DescribeOPLogsRequest;
import com.ucloudstack.apis.DescribeOPLogsResponse;
import com.ucloudstack.apis.ChangeMemberPasswordRequest;
import com.ucloudstack.apis.ChangeMemberPasswordResponse;
import com.ucloudstack.apis.CreateAdminRequest;
import com.ucloudstack.apis.CreateAdminResponse;
import com.ucloudstack.apis.CreateSubMemberRequest;
import com.ucloudstack.apis.CreateSubMemberResponse;
import com.ucloudstack.apis.DeleteAdminRequest;
import com.ucloudstack.apis.DeleteAdminResponse;
import com.ucloudstack.apis.DeleteMemberRequest;
import com.ucloudstack.apis.DeleteMemberResponse;
import com.ucloudstack.apis.DescribeMemberRequest;
import com.ucloudstack.apis.DescribeMemberResponse;
import com.ucloudstack.apis.DescribePermissionRequest;
import com.ucloudstack.apis.DescribePermissionResponse;
import com.ucloudstack.apis.FreezeSubMemberRequest;
import com.ucloudstack.apis.FreezeSubMemberResponse;
import com.ucloudstack.apis.GetMemberInfoRequest;
import com.ucloudstack.apis.GetMemberInfoResponse;
import com.ucloudstack.apis.ListAdminRequest;
import com.ucloudstack.apis.ListAdminResponse;
import com.ucloudstack.apis.LoginByPasswordRequest;
import com.ucloudstack.apis.LoginByPasswordResponse;
import com.ucloudstack.apis.LogoutTokenRequest;
import com.ucloudstack.apis.LogoutTokenResponse;
import com.ucloudstack.apis.UnFreezeSubMemberRequest;
import com.ucloudstack.apis.UnFreezeSubMemberResponse;
import com.ucloudstack.apis.UpdateDigitalCertRequest;
import com.ucloudstack.apis.UpdateDigitalCertResponse;
import com.ucloudstack.apis.UpdateMemberEmailRequest;
import com.ucloudstack.apis.UpdateMemberEmailResponse;
import com.ucloudstack.apis.UpdateMemberNameRequest;
import com.ucloudstack.apis.UpdateMemberNameResponse;
import com.ucloudstack.apis.UpdateMemberOAuth2UniqueIDRequest;
import com.ucloudstack.apis.UpdateMemberOAuth2UniqueIDResponse;
import com.ucloudstack.apis.UpdateMemberPhoneRequest;
import com.ucloudstack.apis.UpdateMemberPhoneResponse;
import com.ucloudstack.apis.CreateMulticastGroupRequest;
import com.ucloudstack.apis.CreateMulticastGroupResponse;
import com.ucloudstack.apis.DeleteMulticastGroupRequest;
import com.ucloudstack.apis.DeleteMulticastGroupResponse;
import com.ucloudstack.apis.DescribeMulticastGroupRequest;
import com.ucloudstack.apis.DescribeMulticastGroupResponse;
import com.ucloudstack.apis.UpdateMulticastGroupRequest;
import com.ucloudstack.apis.UpdateMulticastGroupResponse;
import com.ucloudstack.apis.ApplyMySQLParamTplRequest;
import com.ucloudstack.apis.ApplyMySQLParamTplResponse;
import com.ucloudstack.apis.CreateMySQLRequest;
import com.ucloudstack.apis.CreateMySQLResponse;
import com.ucloudstack.apis.CreateMySQLParamTplRequest;
import com.ucloudstack.apis.CreateMySQLParamTplResponse;
import com.ucloudstack.apis.CreateMySQLSlaveRequest;
import com.ucloudstack.apis.CreateMySQLSlaveResponse;
import com.ucloudstack.apis.DeleteMySQLRequest;
import com.ucloudstack.apis.DeleteMySQLResponse;
import com.ucloudstack.apis.DeleteMySQLParamTplRequest;
import com.ucloudstack.apis.DeleteMySQLParamTplResponse;
import com.ucloudstack.apis.DescribeMySQLRequest;
import com.ucloudstack.apis.DescribeMySQLResponse;
import com.ucloudstack.apis.DescribeMySQLConfigParamRequest;
import com.ucloudstack.apis.DescribeMySQLConfigParamResponse;
import com.ucloudstack.apis.DescribeMySQLErrorLogsRequest;
import com.ucloudstack.apis.DescribeMySQLErrorLogsResponse;
import com.ucloudstack.apis.DescribeMySQLParamTplRequest;
import com.ucloudstack.apis.DescribeMySQLParamTplResponse;
import com.ucloudstack.apis.DescribeMySQLParamTplsRequest;
import com.ucloudstack.apis.DescribeMySQLParamTplsResponse;
import com.ucloudstack.apis.DescribeMySQLSlowLogRecordsRequest;
import com.ucloudstack.apis.DescribeMySQLSlowLogRecordsResponse;
import com.ucloudstack.apis.DescribePMAURLRequest;
import com.ucloudstack.apis.DescribePMAURLResponse;
import com.ucloudstack.apis.DowngradeMySQLRequest;
import com.ucloudstack.apis.DowngradeMySQLResponse;
import com.ucloudstack.apis.GetMySQLPriceRequest;
import com.ucloudstack.apis.GetMySQLPriceResponse;
import com.ucloudstack.apis.ResetMySQLPasswordRequest;
import com.ucloudstack.apis.ResetMySQLPasswordResponse;
import com.ucloudstack.apis.RestartMySQLInstanceRequest;
import com.ucloudstack.apis.RestartMySQLInstanceResponse;
import com.ucloudstack.apis.UpdateMySQLConfigParamRequest;
import com.ucloudstack.apis.UpdateMySQLConfigParamResponse;
import com.ucloudstack.apis.UpdateMySQLParamTplRequest;
import com.ucloudstack.apis.UpdateMySQLParamTplResponse;
import com.ucloudstack.apis.UpgradeMySQLRequest;
import com.ucloudstack.apis.UpgradeMySQLResponse;
import com.ucloudstack.apis.UpgradeMySQLToHARequest;
import com.ucloudstack.apis.UpgradeMySQLToHAResponse;
import com.ucloudstack.apis.BindEIPToNATGWRequest;
import com.ucloudstack.apis.BindEIPToNATGWResponse;
import com.ucloudstack.apis.CreateNATGWRequest;
import com.ucloudstack.apis.CreateNATGWResponse;
import com.ucloudstack.apis.CreateNATGWPolicyRequest;
import com.ucloudstack.apis.CreateNATGWPolicyResponse;
import com.ucloudstack.apis.CreateNATGWRuleRequest;
import com.ucloudstack.apis.CreateNATGWRuleResponse;
import com.ucloudstack.apis.DeleteNATGWRequest;
import com.ucloudstack.apis.DeleteNATGWResponse;
import com.ucloudstack.apis.DeleteNATGWPolicyRequest;
import com.ucloudstack.apis.DeleteNATGWPolicyResponse;
import com.ucloudstack.apis.DeleteNATGWRuleRequest;
import com.ucloudstack.apis.DeleteNATGWRuleResponse;
import com.ucloudstack.apis.DescribeNATGWRequest;
import com.ucloudstack.apis.DescribeNATGWResponse;
import com.ucloudstack.apis.DescribeNATGWPolicyRequest;
import com.ucloudstack.apis.DescribeNATGWPolicyResponse;
import com.ucloudstack.apis.DescribeNATGWRuleRequest;
import com.ucloudstack.apis.DescribeNATGWRuleResponse;
import com.ucloudstack.apis.GetNATGWPriceRequest;
import com.ucloudstack.apis.GetNATGWPriceResponse;
import com.ucloudstack.apis.UnbindEIPFromNATGWRequest;
import com.ucloudstack.apis.UnbindEIPFromNATGWResponse;
import com.ucloudstack.apis.UpdateNATGWPolicyRequest;
import com.ucloudstack.apis.UpdateNATGWPolicyResponse;
import com.ucloudstack.apis.UpdateNATGWRuleRequest;
import com.ucloudstack.apis.UpdateNATGWRuleResponse;
import com.ucloudstack.apis.UpdateSGFromNATGWRequest;
import com.ucloudstack.apis.UpdateSGFromNATGWResponse;
import com.ucloudstack.apis.UpgradeNATGWToHARequest;
import com.ucloudstack.apis.UpgradeNATGWToHAResponse;
import com.ucloudstack.apis.AttachNICRequest;
import com.ucloudstack.apis.AttachNICResponse;
import com.ucloudstack.apis.CheckMACInUseRequest;
import com.ucloudstack.apis.CheckMACInUseResponse;
import com.ucloudstack.apis.CreateNICRequest;
import com.ucloudstack.apis.CreateNICResponse;
import com.ucloudstack.apis.DeleteNICRequest;
import com.ucloudstack.apis.DeleteNICResponse;
import com.ucloudstack.apis.DescribeNICRequest;
import com.ucloudstack.apis.DescribeNICResponse;
import com.ucloudstack.apis.DetachNICRequest;
import com.ucloudstack.apis.DetachNICResponse;
import com.ucloudstack.apis.GetCreateNICPriceRequest;
import com.ucloudstack.apis.GetCreateNICPriceResponse;
import com.ucloudstack.apis.GetUpdateNICPriceRequest;
import com.ucloudstack.apis.GetUpdateNICPriceResponse;
import com.ucloudstack.apis.UpdateNICIPRequest;
import com.ucloudstack.apis.UpdateNICIPResponse;
import com.ucloudstack.apis.UpdateNICIPBandwidthRequest;
import com.ucloudstack.apis.UpdateNICIPBandwidthResponse;
import com.ucloudstack.apis.UpdateNICMACRequest;
import com.ucloudstack.apis.UpdateNICMACResponse;
import com.ucloudstack.apis.UpdateNICPFRequest;
import com.ucloudstack.apis.UpdateNICPFResponse;
import com.ucloudstack.apis.UpdateNICTrafficShapingRequest;
import com.ucloudstack.apis.UpdateNICTrafficShapingResponse;
import com.ucloudstack.apis.AbortMigratePaaSInstanceRequest;
import com.ucloudstack.apis.AbortMigratePaaSInstanceResponse;
import com.ucloudstack.apis.DescribeAuditLogRequest;
import com.ucloudstack.apis.DescribeAuditLogResponse;
import com.ucloudstack.apis.DescribePaaSInstanceRequest;
import com.ucloudstack.apis.DescribePaaSInstanceResponse;
import com.ucloudstack.apis.DescribeParametersHistoriesRequest;
import com.ucloudstack.apis.DescribeParametersHistoriesResponse;
import com.ucloudstack.apis.GetConnectionInfoRequest;
import com.ucloudstack.apis.GetConnectionInfoResponse;
import com.ucloudstack.apis.GetMigratePaaSInstancePriceRequest;
import com.ucloudstack.apis.GetMigratePaaSInstancePriceResponse;
import com.ucloudstack.apis.GetMigratePaaSStoragePriceRequest;
import com.ucloudstack.apis.GetMigratePaaSStoragePriceResponse;
import com.ucloudstack.apis.MigratePaaSInstanceRequest;
import com.ucloudstack.apis.MigratePaaSInstanceResponse;
import com.ucloudstack.apis.MigratePaaSStorageRequest;
import com.ucloudstack.apis.MigratePaaSStorageResponse;
import com.ucloudstack.apis.RecoverPaaSConfigRequest;
import com.ucloudstack.apis.RecoverPaaSConfigResponse;
import com.ucloudstack.apis.StartPaaSInstanceRequest;
import com.ucloudstack.apis.StartPaaSInstanceResponse;
import com.ucloudstack.apis.StopPaaSInstanceRequest;
import com.ucloudstack.apis.StopPaaSInstanceResponse;
import com.ucloudstack.apis.UpdateAuditLogRequest;
import com.ucloudstack.apis.UpdateAuditLogResponse;
import com.ucloudstack.apis.UpdatePaaSDiskQoSRequest;
import com.ucloudstack.apis.UpdatePaaSDiskQoSResponse;
import com.ucloudstack.apis.UpdateTerminationPolicyRequest;
import com.ucloudstack.apis.UpdateTerminationPolicyResponse;
import com.ucloudstack.apis.CreateOrchTaskRequest;
import com.ucloudstack.apis.CreateOrchTaskResponse;
import com.ucloudstack.apis.DeleteOrchTaskRequest;
import com.ucloudstack.apis.DeleteOrchTaskResponse;
import com.ucloudstack.apis.DescribeOrchTaskRequest;
import com.ucloudstack.apis.DescribeOrchTaskResponse;
import com.ucloudstack.apis.DescribeOrchTaskTypeRequest;
import com.ucloudstack.apis.DescribeOrchTaskTypeResponse;
import com.ucloudstack.apis.OperateOrchTaskRequest;
import com.ucloudstack.apis.OperateOrchTaskResponse;
import com.ucloudstack.apis.UpdateOrchTaskRequest;
import com.ucloudstack.apis.UpdateOrchTaskResponse;
import com.ucloudstack.apis.CreateOSSRequest;
import com.ucloudstack.apis.CreateOSSResponse;
import com.ucloudstack.apis.DeleteOSSRequest;
import com.ucloudstack.apis.DeleteOSSResponse;
import com.ucloudstack.apis.DescribeOSSRequest;
import com.ucloudstack.apis.DescribeOSSResponse;
import com.ucloudstack.apis.DowngradeOSSRequest;
import com.ucloudstack.apis.DowngradeOSSResponse;
import com.ucloudstack.apis.GetOSSPriceRequest;
import com.ucloudstack.apis.GetOSSPriceResponse;
import com.ucloudstack.apis.ResetOSSPasswordRequest;
import com.ucloudstack.apis.ResetOSSPasswordResponse;
import com.ucloudstack.apis.UpgradeOSSRequest;
import com.ucloudstack.apis.UpgradeOSSResponse;
import com.ucloudstack.apis.AttachPlatformStorageDiskRequest;
import com.ucloudstack.apis.AttachPlatformStorageDiskResponse;
import com.ucloudstack.apis.CreatePlatformStorageDiskRequest;
import com.ucloudstack.apis.CreatePlatformStorageDiskResponse;
import com.ucloudstack.apis.DeletePlatformStorageDiskRequest;
import com.ucloudstack.apis.DeletePlatformStorageDiskResponse;
import com.ucloudstack.apis.DescribePlatformStorageRequest;
import com.ucloudstack.apis.DescribePlatformStorageResponse;
import com.ucloudstack.apis.DescribePlatformStorageDiskRequest;
import com.ucloudstack.apis.DescribePlatformStorageDiskResponse;
import com.ucloudstack.apis.ResizePlatformStorageDiskRequest;
import com.ucloudstack.apis.ResizePlatformStorageDiskResponse;
import com.ucloudstack.apis.AllocatePMRequest;
import com.ucloudstack.apis.AllocatePMResponse;
import com.ucloudstack.apis.AllocatePMVNCSessionRequest;
import com.ucloudstack.apis.AllocatePMVNCSessionResponse;
import com.ucloudstack.apis.CancelInstallTaskV2Request;
import com.ucloudstack.apis.CancelInstallTaskV2Response;
import com.ucloudstack.apis.CleanPXERequest;
import com.ucloudstack.apis.CleanPXEResponse;
import com.ucloudstack.apis.CloneBMCTypeRequest;
import com.ucloudstack.apis.CloneBMCTypeResponse;
import com.ucloudstack.apis.CloneKickstartTemplateRequest;
import com.ucloudstack.apis.CloneKickstartTemplateResponse;
import com.ucloudstack.apis.ClonePartitionTemplateRequest;
import com.ucloudstack.apis.ClonePartitionTemplateResponse;
import com.ucloudstack.apis.CloseKVMSessionV2Request;
import com.ucloudstack.apis.CloseKVMSessionV2Response;
import com.ucloudstack.apis.CreateBMCTypeRequest;
import com.ucloudstack.apis.CreateBMCTypeResponse;
import com.ucloudstack.apis.CreateInstallProfileRequest;
import com.ucloudstack.apis.CreateInstallProfileResponse;
import com.ucloudstack.apis.CreateInstallTaskV2Request;
import com.ucloudstack.apis.CreateInstallTaskV2Response;
import com.ucloudstack.apis.CreateKVMSessionV2Request;
import com.ucloudstack.apis.CreateKVMSessionV2Response;
import com.ucloudstack.apis.CreateKickstartTemplateRequest;
import com.ucloudstack.apis.CreateKickstartTemplateResponse;
import com.ucloudstack.apis.CreateOSMediaV2Request;
import com.ucloudstack.apis.CreateOSMediaV2Response;
import com.ucloudstack.apis.CreatePMV2Request;
import com.ucloudstack.apis.CreatePMV2Response;
import com.ucloudstack.apis.CreatePartitionTemplateRequest;
import com.ucloudstack.apis.CreatePartitionTemplateResponse;
import com.ucloudstack.apis.DeleteBMCTypeRequest;
import com.ucloudstack.apis.DeleteBMCTypeResponse;
import com.ucloudstack.apis.DeleteInstallProfileRequest;
import com.ucloudstack.apis.DeleteInstallProfileResponse;
import com.ucloudstack.apis.DeleteInstallTaskV2Request;
import com.ucloudstack.apis.DeleteInstallTaskV2Response;
import com.ucloudstack.apis.DeleteKickstartTemplateRequest;
import com.ucloudstack.apis.DeleteKickstartTemplateResponse;
import com.ucloudstack.apis.DeleteOSMediaV2Request;
import com.ucloudstack.apis.DeleteOSMediaV2Response;
import com.ucloudstack.apis.DeletePMV2Request;
import com.ucloudstack.apis.DeletePMV2Response;
import com.ucloudstack.apis.DeletePartitionTemplateRequest;
import com.ucloudstack.apis.DeletePartitionTemplateResponse;
import com.ucloudstack.apis.DetectBMCTypeV2Request;
import com.ucloudstack.apis.DetectBMCTypeV2Response;
import com.ucloudstack.apis.DiscoverDHCPServersRequest;
import com.ucloudstack.apis.DiscoverDHCPServersResponse;
import com.ucloudstack.apis.DiscoverPMHardwareV2Request;
import com.ucloudstack.apis.DiscoverPMHardwareV2Response;
import com.ucloudstack.apis.GetBMCTypeRequest;
import com.ucloudstack.apis.GetBMCTypeResponse;
import com.ucloudstack.apis.GetDHCPNetworkRequest;
import com.ucloudstack.apis.GetDHCPNetworkResponse;
import com.ucloudstack.apis.GetDHCPServerStateRequest;
import com.ucloudstack.apis.GetDHCPServerStateResponse;
import com.ucloudstack.apis.GetInstallLogsV2Request;
import com.ucloudstack.apis.GetInstallLogsV2Response;
import com.ucloudstack.apis.GetInstallStatusByTaskIDV2Request;
import com.ucloudstack.apis.GetInstallStatusByTaskIDV2Response;
import com.ucloudstack.apis.GetInstallTaskV2Request;
import com.ucloudstack.apis.GetInstallTaskV2Response;
import com.ucloudstack.apis.GetKickstartTemplateRequest;
import com.ucloudstack.apis.GetKickstartTemplateResponse;
import com.ucloudstack.apis.GetLatestInstallConfigRequest;
import com.ucloudstack.apis.GetLatestInstallConfigResponse;
import com.ucloudstack.apis.GetOSMediaV2Request;
import com.ucloudstack.apis.GetOSMediaV2Response;
import com.ucloudstack.apis.GetPMHardwareV2Request;
import com.ucloudstack.apis.GetPMHardwareV2Response;
import com.ucloudstack.apis.GetPMJNLPFileV2Request;
import com.ucloudstack.apis.GetPMJNLPFileV2Response;
import com.ucloudstack.apis.GetPMPowerStatusV2Request;
import com.ucloudstack.apis.GetPMPowerStatusV2Response;
import com.ucloudstack.apis.GetPartitionTemplateRequest;
import com.ucloudstack.apis.GetPartitionTemplateResponse;
import com.ucloudstack.apis.ListBMCTypesRequest;
import com.ucloudstack.apis.ListBMCTypesResponse;
import com.ucloudstack.apis.ListInstallProfilesRequest;
import com.ucloudstack.apis.ListInstallProfilesResponse;
import com.ucloudstack.apis.ListInstallTasksV2Request;
import com.ucloudstack.apis.ListInstallTasksV2Response;
import com.ucloudstack.apis.ListKVMSessionsV2Request;
import com.ucloudstack.apis.ListKVMSessionsV2Response;
import com.ucloudstack.apis.ListKickstartTemplatesRequest;
import com.ucloudstack.apis.ListKickstartTemplatesResponse;
import com.ucloudstack.apis.ListOSMediaV2Request;
import com.ucloudstack.apis.ListOSMediaV2Response;
import com.ucloudstack.apis.ListPMV2Request;
import com.ucloudstack.apis.ListPMV2Response;
import com.ucloudstack.apis.ListPartitionTemplatesRequest;
import com.ucloudstack.apis.ListPartitionTemplatesResponse;
import com.ucloudstack.apis.PowerControlPMV2Request;
import com.ucloudstack.apis.PowerControlPMV2Response;
import com.ucloudstack.apis.PreviewKickstartCommandsRequest;
import com.ucloudstack.apis.PreviewKickstartCommandsResponse;
import com.ucloudstack.apis.PreviewKickstartTemplateRequest;
import com.ucloudstack.apis.PreviewKickstartTemplateResponse;
import com.ucloudstack.apis.RecyclePMRequest;
import com.ucloudstack.apis.RecyclePMResponse;
import com.ucloudstack.apis.RetryInstallTaskV2Request;
import com.ucloudstack.apis.RetryInstallTaskV2Response;
import com.ucloudstack.apis.SetDHCPNetworkRequest;
import com.ucloudstack.apis.SetDHCPNetworkResponse;
import com.ucloudstack.apis.SetDefaultPartitionTemplateRequest;
import com.ucloudstack.apis.SetDefaultPartitionTemplateResponse;
import com.ucloudstack.apis.TestBMCTypeRequest;
import com.ucloudstack.apis.TestBMCTypeResponse;
import com.ucloudstack.apis.TestPMIPMIV2Request;
import com.ucloudstack.apis.TestPMIPMIV2Response;
import com.ucloudstack.apis.UpdateBMCTypeRequest;
import com.ucloudstack.apis.UpdateBMCTypeResponse;
import com.ucloudstack.apis.UpdateInstallProfileRequest;
import com.ucloudstack.apis.UpdateInstallProfileResponse;
import com.ucloudstack.apis.UpdateKickstartTemplateRequest;
import com.ucloudstack.apis.UpdateKickstartTemplateResponse;
import com.ucloudstack.apis.UpdatePMV2Request;
import com.ucloudstack.apis.UpdatePMV2Response;
import com.ucloudstack.apis.UpdatePartitionTemplateRequest;
import com.ucloudstack.apis.UpdatePartitionTemplateResponse;
import com.ucloudstack.apis.ValidateKickstartTemplateRequest;
import com.ucloudstack.apis.ValidateKickstartTemplateResponse;
import com.ucloudstack.apis.ValidatePartitionConfigRequest;
import com.ucloudstack.apis.ValidatePartitionConfigResponse;
import com.ucloudstack.apis.CreateMemberTagRequest;
import com.ucloudstack.apis.CreateMemberTagResponse;
import com.ucloudstack.apis.CreateProjectRequest;
import com.ucloudstack.apis.CreateProjectResponse;
import com.ucloudstack.apis.CreateRoleRequest;
import com.ucloudstack.apis.CreateRoleResponse;
import com.ucloudstack.apis.DeleteMemberTagRequest;
import com.ucloudstack.apis.DeleteMemberTagResponse;
import com.ucloudstack.apis.DeleteProjectRequest;
import com.ucloudstack.apis.DeleteProjectResponse;
import com.ucloudstack.apis.DeleteRoleRequest;
import com.ucloudstack.apis.DeleteRoleResponse;
import com.ucloudstack.apis.DescribeProductRequest;
import com.ucloudstack.apis.DescribeProductResponse;
import com.ucloudstack.apis.DisableCompanyProductTypeRequest;
import com.ucloudstack.apis.DisableCompanyProductTypeResponse;
import com.ucloudstack.apis.EnableCompanyProductTypeRequest;
import com.ucloudstack.apis.EnableCompanyProductTypeResponse;
import com.ucloudstack.apis.GetProjectRequest;
import com.ucloudstack.apis.GetProjectResponse;
import com.ucloudstack.apis.GetRoleRequest;
import com.ucloudstack.apis.GetRoleResponse;
import com.ucloudstack.apis.ListMemberTagsRequest;
import com.ucloudstack.apis.ListMemberTagsResponse;
import com.ucloudstack.apis.ListProductPermissionsRequest;
import com.ucloudstack.apis.ListProductPermissionsResponse;
import com.ucloudstack.apis.ListProductResourcesRequest;
import com.ucloudstack.apis.ListProductResourcesResponse;
import com.ucloudstack.apis.ListProductTypeCompanysRequest;
import com.ucloudstack.apis.ListProductTypeCompanysResponse;
import com.ucloudstack.apis.ListProjectsRequest;
import com.ucloudstack.apis.ListProjectsResponse;
import com.ucloudstack.apis.ListRolesRequest;
import com.ucloudstack.apis.ListRolesResponse;
import com.ucloudstack.apis.MoveProjectResourceRequest;
import com.ucloudstack.apis.MoveProjectResourceResponse;
import com.ucloudstack.apis.RenameProjectRequest;
import com.ucloudstack.apis.RenameProjectResponse;
import com.ucloudstack.apis.RenameRoleRequest;
import com.ucloudstack.apis.RenameRoleResponse;
import com.ucloudstack.apis.UpdateRolePermissionRequest;
import com.ucloudstack.apis.UpdateRolePermissionResponse;
import com.ucloudstack.apis.DescribeRecycledResourceRequest;
import com.ucloudstack.apis.DescribeRecycledResourceResponse;
import com.ucloudstack.apis.RollbackResourceRequest;
import com.ucloudstack.apis.RollbackResourceResponse;
import com.ucloudstack.apis.TerminateResourceRequest;
import com.ucloudstack.apis.TerminateResourceResponse;
import com.ucloudstack.apis.AllocateRedisConsoleSessionRequest;
import com.ucloudstack.apis.AllocateRedisConsoleSessionResponse;
import com.ucloudstack.apis.ApplyRedisConfigFileRequest;
import com.ucloudstack.apis.ApplyRedisConfigFileResponse;
import com.ucloudstack.apis.CreateRedisRequest;
import com.ucloudstack.apis.CreateRedisResponse;
import com.ucloudstack.apis.CreateRedisConfigFileRequest;
import com.ucloudstack.apis.CreateRedisConfigFileResponse;
import com.ucloudstack.apis.CreateSlaveRedisRequest;
import com.ucloudstack.apis.CreateSlaveRedisResponse;
import com.ucloudstack.apis.DeleteRedisRequest;
import com.ucloudstack.apis.DeleteRedisResponse;
import com.ucloudstack.apis.DeleteRedisConfigFileRequest;
import com.ucloudstack.apis.DeleteRedisConfigFileResponse;
import com.ucloudstack.apis.DescribeRedisRequest;
import com.ucloudstack.apis.DescribeRedisResponse;
import com.ucloudstack.apis.DescribeRedisConfigFileRequest;
import com.ucloudstack.apis.DescribeRedisConfigFileResponse;
import com.ucloudstack.apis.DescribeRedisConfigParamsRequest;
import com.ucloudstack.apis.DescribeRedisConfigParamsResponse;
import com.ucloudstack.apis.DescribeRedisSlowlogRequest;
import com.ucloudstack.apis.DescribeRedisSlowlogResponse;
import com.ucloudstack.apis.DowngradeRedisRequest;
import com.ucloudstack.apis.DowngradeRedisResponse;
import com.ucloudstack.apis.FlushRedisRequest;
import com.ucloudstack.apis.FlushRedisResponse;
import com.ucloudstack.apis.GetRedisPriceRequest;
import com.ucloudstack.apis.GetRedisPriceResponse;
import com.ucloudstack.apis.UpdateRedisConfigParamsRequest;
import com.ucloudstack.apis.UpdateRedisConfigParamsResponse;
import com.ucloudstack.apis.UpdateRedisPasswordRequest;
import com.ucloudstack.apis.UpdateRedisPasswordResponse;
import com.ucloudstack.apis.UpgradeRedisRequest;
import com.ucloudstack.apis.UpgradeRedisResponse;
import com.ucloudstack.apis.UpgradeRedisToHARequest;
import com.ucloudstack.apis.UpgradeRedisToHAResponse;
import com.ucloudstack.apis.AddRegionRequest;
import com.ucloudstack.apis.AddRegionResponse;
import com.ucloudstack.apis.DescribeRegionRequest;
import com.ucloudstack.apis.DescribeRegionResponse;
import com.ucloudstack.apis.ModifyNameAndRemarkRequest;
import com.ucloudstack.apis.ModifyNameAndRemarkResponse;
import com.ucloudstack.apis.UpdateAdminRegionRequest;
import com.ucloudstack.apis.UpdateAdminRegionResponse;
import com.ucloudstack.apis.UpdateCompanyRegionRequest;
import com.ucloudstack.apis.UpdateCompanyRegionResponse;
import com.ucloudstack.apis.UpdateRegionRequest;
import com.ucloudstack.apis.UpdateRegionResponse;
import com.ucloudstack.apis.CreateResourceFromTemplateRequest;
import com.ucloudstack.apis.CreateResourceFromTemplateResponse;
import com.ucloudstack.apis.CreateResourceTemplateRequest;
import com.ucloudstack.apis.CreateResourceTemplateResponse;
import com.ucloudstack.apis.DeleteResourceTemplateRequest;
import com.ucloudstack.apis.DeleteResourceTemplateResponse;
import com.ucloudstack.apis.DescribeResourceTemplateRequest;
import com.ucloudstack.apis.DescribeResourceTemplateResponse;
import com.ucloudstack.apis.UpdateResourceTemplateRequest;
import com.ucloudstack.apis.UpdateResourceTemplateResponse;
import com.ucloudstack.apis.S3LoginRequest;
import com.ucloudstack.apis.S3LoginResponse;
import com.ucloudstack.apis.CreateDirectConnectRequest;
import com.ucloudstack.apis.CreateDirectConnectResponse;
import com.ucloudstack.apis.CreateSegmentRequest;
import com.ucloudstack.apis.CreateSegmentResponse;
import com.ucloudstack.apis.CreateSegmentRouteRequest;
import com.ucloudstack.apis.CreateSegmentRouteResponse;
import com.ucloudstack.apis.DeleteDirectConnectRequest;
import com.ucloudstack.apis.DeleteDirectConnectResponse;
import com.ucloudstack.apis.DeleteSegmentRequest;
import com.ucloudstack.apis.DeleteSegmentResponse;
import com.ucloudstack.apis.DeleteSegmentRouteRequest;
import com.ucloudstack.apis.DeleteSegmentRouteResponse;
import com.ucloudstack.apis.DescribeDirectConnectRequest;
import com.ucloudstack.apis.DescribeDirectConnectResponse;
import com.ucloudstack.apis.DescribeSegmentRequest;
import com.ucloudstack.apis.DescribeSegmentResponse;
import com.ucloudstack.apis.DescribeSegmentRouteRequest;
import com.ucloudstack.apis.DescribeSegmentRouteResponse;
import com.ucloudstack.apis.UpdateDirectConnectBandwidthRequest;
import com.ucloudstack.apis.UpdateDirectConnectBandwidthResponse;
import com.ucloudstack.apis.UpdateDirectConnectRemoteSubnetCIDRsRequest;
import com.ucloudstack.apis.UpdateDirectConnectRemoteSubnetCIDRsResponse;
import com.ucloudstack.apis.UpdateSegmentRequest;
import com.ucloudstack.apis.UpdateSegmentResponse;
import com.ucloudstack.apis.UpdateSegmentRouteRequest;
import com.ucloudstack.apis.UpdateSegmentRouteResponse;
import com.ucloudstack.apis.AliasSetRequest;
import com.ucloudstack.apis.AliasSetResponse;
import com.ucloudstack.apis.AliasStorageSetRequest;
import com.ucloudstack.apis.AliasStorageSetResponse;
import com.ucloudstack.apis.DescribeResourceUsersRequest;
import com.ucloudstack.apis.DescribeResourceUsersResponse;
import com.ucloudstack.apis.DescribeStorageSetRequest;
import com.ucloudstack.apis.DescribeStorageSetResponse;
import com.ucloudstack.apis.DescribeStorageSetSortPolicyRequest;
import com.ucloudstack.apis.DescribeStorageSetSortPolicyResponse;
import com.ucloudstack.apis.DescribeStorageTypeRequest;
import com.ucloudstack.apis.DescribeStorageTypeResponse;
import com.ucloudstack.apis.DescribeVMSetRequest;
import com.ucloudstack.apis.DescribeVMSetResponse;
import com.ucloudstack.apis.DescribeVMTypeRequest;
import com.ucloudstack.apis.DescribeVMTypeResponse;
import com.ucloudstack.apis.UpdateComputeSetCPUAllocationRatioRequest;
import com.ucloudstack.apis.UpdateComputeSetCPUAllocationRatioResponse;
import com.ucloudstack.apis.UpdateComputeSetCPUModelsRequest;
import com.ucloudstack.apis.UpdateComputeSetCPUModelsResponse;
import com.ucloudstack.apis.UpdateResourcePermissionRequest;
import com.ucloudstack.apis.UpdateResourcePermissionResponse;
import com.ucloudstack.apis.UpdateStorageSetSortPolicyRequest;
import com.ucloudstack.apis.UpdateStorageSetSortPolicyResponse;
import com.ucloudstack.apis.UpdateVMSetBoundImageRequest;
import com.ucloudstack.apis.UpdateVMSetBoundImageResponse;
import com.ucloudstack.apis.UpdateVMSetBoundStorageSetRequest;
import com.ucloudstack.apis.UpdateVMSetBoundStorageSetResponse;
import com.ucloudstack.apis.BindSecurityGroupRequest;
import com.ucloudstack.apis.BindSecurityGroupResponse;
import com.ucloudstack.apis.CreateIPGroupRequest;
import com.ucloudstack.apis.CreateIPGroupResponse;
import com.ucloudstack.apis.CreatePortGroupRequest;
import com.ucloudstack.apis.CreatePortGroupResponse;
import com.ucloudstack.apis.CreateSecurityGroupRequest;
import com.ucloudstack.apis.CreateSecurityGroupResponse;
import com.ucloudstack.apis.CreateSecurityGroupRuleRequest;
import com.ucloudstack.apis.CreateSecurityGroupRuleResponse;
import com.ucloudstack.apis.DeleteIPGroupRequest;
import com.ucloudstack.apis.DeleteIPGroupResponse;
import com.ucloudstack.apis.DeletePortGroupRequest;
import com.ucloudstack.apis.DeletePortGroupResponse;
import com.ucloudstack.apis.DeleteSecurityGroupRequest;
import com.ucloudstack.apis.DeleteSecurityGroupResponse;
import com.ucloudstack.apis.DeleteSecurityGroupRuleRequest;
import com.ucloudstack.apis.DeleteSecurityGroupRuleResponse;
import com.ucloudstack.apis.DescribeIPGroupRequest;
import com.ucloudstack.apis.DescribeIPGroupResponse;
import com.ucloudstack.apis.DescribePortGroupRequest;
import com.ucloudstack.apis.DescribePortGroupResponse;
import com.ucloudstack.apis.DescribeSecurityGroupRequest;
import com.ucloudstack.apis.DescribeSecurityGroupResponse;
import com.ucloudstack.apis.DescribeSecurityGroupResourceRequest;
import com.ucloudstack.apis.DescribeSecurityGroupResourceResponse;
import com.ucloudstack.apis.DescribeSecurityGroupRuleRequest;
import com.ucloudstack.apis.DescribeSecurityGroupRuleResponse;
import com.ucloudstack.apis.UnBindSecurityGroupRequest;
import com.ucloudstack.apis.UnBindSecurityGroupResponse;
import com.ucloudstack.apis.UpdateIPGroupRequest;
import com.ucloudstack.apis.UpdateIPGroupResponse;
import com.ucloudstack.apis.UpdatePortGroupRequest;
import com.ucloudstack.apis.UpdatePortGroupResponse;
import com.ucloudstack.apis.UpdateSecurityGroupRuleRequest;
import com.ucloudstack.apis.UpdateSecurityGroupRuleResponse;
import com.ucloudstack.apis.AllocateExternalStorageSetDiskRequest;
import com.ucloudstack.apis.AllocateExternalStorageSetDiskResponse;
import com.ucloudstack.apis.AttachExternalDiskRequest;
import com.ucloudstack.apis.AttachExternalDiskResponse;
import com.ucloudstack.apis.CreateExternalStorageSetRequest;
import com.ucloudstack.apis.CreateExternalStorageSetResponse;
import com.ucloudstack.apis.DeleteExternalStorageSetRequest;
import com.ucloudstack.apis.DeleteExternalStorageSetResponse;
import com.ucloudstack.apis.DescribeExternalDiskRequest;
import com.ucloudstack.apis.DescribeExternalDiskResponse;
import com.ucloudstack.apis.DescribeExternalStorageSetRequest;
import com.ucloudstack.apis.DescribeExternalStorageSetResponse;
import com.ucloudstack.apis.DescribeExternalStorageTypeRequest;
import com.ucloudstack.apis.DescribeExternalStorageTypeResponse;
import com.ucloudstack.apis.DetachExternalDiskRequest;
import com.ucloudstack.apis.DetachExternalDiskResponse;
import com.ucloudstack.apis.ScanFCSANRequest;
import com.ucloudstack.apis.ScanFCSANResponse;
import com.ucloudstack.apis.ScanISCSIDiskRequest;
import com.ucloudstack.apis.ScanISCSIDiskResponse;
import com.ucloudstack.apis.SetShareAbleExternalStorageRequest;
import com.ucloudstack.apis.SetShareAbleExternalStorageResponse;
import com.ucloudstack.apis.UpdateExternalStorageSetRequest;
import com.ucloudstack.apis.UpdateExternalStorageSetResponse;
import com.ucloudstack.apis.CompleteSMCRequest;
import com.ucloudstack.apis.CompleteSMCResponse;
import com.ucloudstack.apis.CreateSMCRequest;
import com.ucloudstack.apis.CreateSMCResponse;
import com.ucloudstack.apis.DeleteSMCRequest;
import com.ucloudstack.apis.DeleteSMCResponse;
import com.ucloudstack.apis.DescribeSMCRequest;
import com.ucloudstack.apis.DescribeSMCResponse;
import com.ucloudstack.apis.SMCHeartbeatRequest;
import com.ucloudstack.apis.SMCHeartbeatResponse;
import com.ucloudstack.apis.SetupSMCRequest;
import com.ucloudstack.apis.SetupSMCResponse;
import com.ucloudstack.apis.StartSMCRequest;
import com.ucloudstack.apis.StartSMCResponse;
import com.ucloudstack.apis.StopSMCRequest;
import com.ucloudstack.apis.StopSMCResponse;
import com.ucloudstack.apis.BindTagRequest;
import com.ucloudstack.apis.BindTagResponse;
import com.ucloudstack.apis.CreateTagRequest;
import com.ucloudstack.apis.CreateTagResponse;
import com.ucloudstack.apis.DeleteTagRequest;
import com.ucloudstack.apis.DeleteTagResponse;
import com.ucloudstack.apis.DescribeBindableTagResourceRequest;
import com.ucloudstack.apis.DescribeBindableTagResourceResponse;
import com.ucloudstack.apis.DescribeTagRequest;
import com.ucloudstack.apis.DescribeTagResponse;
import com.ucloudstack.apis.DescribeTagResourceRequest;
import com.ucloudstack.apis.DescribeTagResourceResponse;
import com.ucloudstack.apis.SetResourceTagsRequest;
import com.ucloudstack.apis.SetResourceTagsResponse;
import com.ucloudstack.apis.UnBindTagRequest;
import com.ucloudstack.apis.UnBindTagResponse;
import com.ucloudstack.apis.CreateTimerRequest;
import com.ucloudstack.apis.CreateTimerResponse;
import com.ucloudstack.apis.DeleteTimerRequest;
import com.ucloudstack.apis.DeleteTimerResponse;
import com.ucloudstack.apis.DescribeTimerRequest;
import com.ucloudstack.apis.DescribeTimerResponse;
import com.ucloudstack.apis.DescribeTimerTaskRequest;
import com.ucloudstack.apis.DescribeTimerTaskResponse;
import com.ucloudstack.apis.UpdateTimerRequest;
import com.ucloudstack.apis.UpdateTimerResponse;
import com.ucloudstack.apis.CreateTrafficMirrorRequest;
import com.ucloudstack.apis.CreateTrafficMirrorResponse;
import com.ucloudstack.apis.DeleteTrafficMirrorRequest;
import com.ucloudstack.apis.DeleteTrafficMirrorResponse;
import com.ucloudstack.apis.DescribeTrafficMirrorRequest;
import com.ucloudstack.apis.DescribeTrafficMirrorResponse;
import com.ucloudstack.apis.DescribeTrafficMirrorSourcesRequest;
import com.ucloudstack.apis.DescribeTrafficMirrorSourcesResponse;
import com.ucloudstack.apis.UpdateTrafficMirrorRequest;
import com.ucloudstack.apis.UpdateTrafficMirrorResponse;
import com.ucloudstack.apis.UpdateTrafficMirrorEnableRequest;
import com.ucloudstack.apis.UpdateTrafficMirrorEnableResponse;
import com.ucloudstack.apis.UpdateTrafficMirrorRuleRequest;
import com.ucloudstack.apis.UpdateTrafficMirrorRuleResponse;
import com.ucloudstack.apis.UpdateTrafficMirrorSourcesRequest;
import com.ucloudstack.apis.UpdateTrafficMirrorSourcesResponse;
import com.ucloudstack.apis.AllocateUSBRequest;
import com.ucloudstack.apis.AllocateUSBResponse;
import com.ucloudstack.apis.AttachUSBRequest;
import com.ucloudstack.apis.AttachUSBResponse;
import com.ucloudstack.apis.DetachUSBRequest;
import com.ucloudstack.apis.DetachUSBResponse;
import com.ucloudstack.apis.ListUSBsRequest;
import com.ucloudstack.apis.ListUSBsResponse;
import com.ucloudstack.apis.AllocateVIPRequest;
import com.ucloudstack.apis.AllocateVIPResponse;
import com.ucloudstack.apis.DescribeVIPRequest;
import com.ucloudstack.apis.DescribeVIPResponse;
import com.ucloudstack.apis.GetVIPDiffPriceRequest;
import com.ucloudstack.apis.GetVIPDiffPriceResponse;
import com.ucloudstack.apis.GetVIPPriceRequest;
import com.ucloudstack.apis.GetVIPPriceResponse;
import com.ucloudstack.apis.ReleaseVIPRequest;
import com.ucloudstack.apis.ReleaseVIPResponse;
import com.ucloudstack.apis.UpdateVIPBandwidthRequest;
import com.ucloudstack.apis.UpdateVIPBandwidthResponse;
import com.ucloudstack.apis.UpdateVIPBindResourceRequest;
import com.ucloudstack.apis.UpdateVIPBindResourceResponse;
import com.ucloudstack.apis.AbortMigrateVMDiskRequest;
import com.ucloudstack.apis.AbortMigrateVMDiskResponse;
import com.ucloudstack.apis.AbortVMSnapshotRequest;
import com.ucloudstack.apis.AbortVMSnapshotResponse;
import com.ucloudstack.apis.AddVMDiskRequest;
import com.ucloudstack.apis.AddVMDiskResponse;
import com.ucloudstack.apis.AddVMNICRequest;
import com.ucloudstack.apis.AddVMNICResponse;
import com.ucloudstack.apis.AllocateVMSSHSessionRequest;
import com.ucloudstack.apis.AllocateVMSSHSessionResponse;
import com.ucloudstack.apis.AllocateVMVNCSessionRequest;
import com.ucloudstack.apis.AllocateVMVNCSessionResponse;
import com.ucloudstack.apis.CancelCloneVMInstanceRequest;
import com.ucloudstack.apis.CancelCloneVMInstanceResponse;
import com.ucloudstack.apis.CloneVMInstanceRequest;
import com.ucloudstack.apis.CloneVMInstanceResponse;
import com.ucloudstack.apis.CreateVMInstanceRequest;
import com.ucloudstack.apis.CreateVMInstanceResponse;
import com.ucloudstack.apis.DeleteVMCRequest;
import com.ucloudstack.apis.DeleteVMCResponse;
import com.ucloudstack.apis.DeleteVMInstanceRequest;
import com.ucloudstack.apis.DeleteVMInstanceResponse;
import com.ucloudstack.apis.DeleteVMNICRequest;
import com.ucloudstack.apis.DeleteVMNICResponse;
import com.ucloudstack.apis.DeleteVMSnapshotRequest;
import com.ucloudstack.apis.DeleteVMSnapshotResponse;
import com.ucloudstack.apis.DescribeCIStatusRequest;
import com.ucloudstack.apis.DescribeCIStatusResponse;
import com.ucloudstack.apis.DescribeVMCRequest;
import com.ucloudstack.apis.DescribeVMCResponse;
import com.ucloudstack.apis.DescribeVMInstanceRequest;
import com.ucloudstack.apis.DescribeVMInstanceResponse;
import com.ucloudstack.apis.DescribeVMWareVMsRequest;
import com.ucloudstack.apis.DescribeVMWareVMsResponse;
import com.ucloudstack.apis.GenerateVMWareConsoleTicketRequest;
import com.ucloudstack.apis.GenerateVMWareConsoleTicketResponse;
import com.ucloudstack.apis.GetPaymentOfPremiumRequest;
import com.ucloudstack.apis.GetPaymentOfPremiumResponse;
import com.ucloudstack.apis.GetVMInstancePriceRequest;
import com.ucloudstack.apis.GetVMInstancePriceResponse;
import com.ucloudstack.apis.GetVMScreenshotRequest;
import com.ucloudstack.apis.GetVMScreenshotResponse;
import com.ucloudstack.apis.GetVMSpiceInfoRequest;
import com.ucloudstack.apis.GetVMSpiceInfoResponse;
import com.ucloudstack.apis.GetVMVNCInfoRequest;
import com.ucloudstack.apis.GetVMVNCInfoResponse;
import com.ucloudstack.apis.GetVMWareClusterDatastoreRequest;
import com.ucloudstack.apis.GetVMWareClusterDatastoreResponse;
import com.ucloudstack.apis.MigrateMgrVMStorageRequest;
import com.ucloudstack.apis.MigrateMgrVMStorageResponse;
import com.ucloudstack.apis.MigrateStorageBandWidthRequest;
import com.ucloudstack.apis.MigrateStorageBandWidthResponse;
import com.ucloudstack.apis.MigrateVMStorageRequest;
import com.ucloudstack.apis.MigrateVMStorageResponse;
import com.ucloudstack.apis.PoweroffVMInstanceRequest;
import com.ucloudstack.apis.PoweroffVMInstanceResponse;
import com.ucloudstack.apis.ReinstallVMInstanceRequest;
import com.ucloudstack.apis.ReinstallVMInstanceResponse;
import com.ucloudstack.apis.ResetVMInstancePasswordRequest;
import com.ucloudstack.apis.ResetVMInstancePasswordResponse;
import com.ucloudstack.apis.ResetVMNetConfigRequest;
import com.ucloudstack.apis.ResetVMNetConfigResponse;
import com.ucloudstack.apis.ResizeVMConfigRequest;
import com.ucloudstack.apis.ResizeVMConfigResponse;
import com.ucloudstack.apis.RestartVMInstanceRequest;
import com.ucloudstack.apis.RestartVMInstanceResponse;
import com.ucloudstack.apis.RestoreVMInstanceRequest;
import com.ucloudstack.apis.RestoreVMInstanceResponse;
import com.ucloudstack.apis.SaveVMInstanceRequest;
import com.ucloudstack.apis.SaveVMInstanceResponse;
import com.ucloudstack.apis.SetBootFromCdromRequest;
import com.ucloudstack.apis.SetBootFromCdromResponse;
import com.ucloudstack.apis.StartVMInstanceRequest;
import com.ucloudstack.apis.StartVMInstanceResponse;
import com.ucloudstack.apis.StopVMInstanceRequest;
import com.ucloudstack.apis.StopVMInstanceResponse;
import com.ucloudstack.apis.UnSetBootFromCdromRequest;
import com.ucloudstack.apis.UnSetBootFromCdromResponse;
import com.ucloudstack.apis.UpdateVMAdvancedOptionsRequest;
import com.ucloudstack.apis.UpdateVMAdvancedOptionsResponse;
import com.ucloudstack.apis.UpdateVMBootBootLoaderTypeRequest;
import com.ucloudstack.apis.UpdateVMBootBootLoaderTypeResponse;
import com.ucloudstack.apis.UpdateVMBootDevicesRequest;
import com.ucloudstack.apis.UpdateVMBootDevicesResponse;
import com.ucloudstack.apis.UpdateVMCPUHypervisorRequest;
import com.ucloudstack.apis.UpdateVMCPUHypervisorResponse;
import com.ucloudstack.apis.UpdateVMCPULimitPercentRequest;
import com.ucloudstack.apis.UpdateVMCPULimitPercentResponse;
import com.ucloudstack.apis.UpdateVMCPUModelRequest;
import com.ucloudstack.apis.UpdateVMCPUModelResponse;
import com.ucloudstack.apis.UpdateVMCPUPriorityRequest;
import com.ucloudstack.apis.UpdateVMCPUPriorityResponse;
import com.ucloudstack.apis.UpdateVMDNSRequest;
import com.ucloudstack.apis.UpdateVMDNSResponse;
import com.ucloudstack.apis.UpdateVMDefaultGWRequest;
import com.ucloudstack.apis.UpdateVMDefaultGWResponse;
import com.ucloudstack.apis.UpdateVMDiskBusRequest;
import com.ucloudstack.apis.UpdateVMDiskBusResponse;
import com.ucloudstack.apis.UpdateVMDiskCacheModeRequest;
import com.ucloudstack.apis.UpdateVMDiskCacheModeResponse;
import com.ucloudstack.apis.UpdateVMHighAvailabilityRequest;
import com.ucloudstack.apis.UpdateVMHighAvailabilityResponse;
import com.ucloudstack.apis.UpdateVMISOSlotRequest;
import com.ucloudstack.apis.UpdateVMISOSlotResponse;
import com.ucloudstack.apis.UpdateVMMACRequest;
import com.ucloudstack.apis.UpdateVMMACResponse;
import com.ucloudstack.apis.UpdateVMNICLinkStateRequest;
import com.ucloudstack.apis.UpdateVMNICLinkStateResponse;
import com.ucloudstack.apis.UpdateVMNICModelRequest;
import com.ucloudstack.apis.UpdateVMNICModelResponse;
import com.ucloudstack.apis.UpdateVMNICQueuesRequest;
import com.ucloudstack.apis.UpdateVMNICQueuesResponse;
import com.ucloudstack.apis.UpdateVMOSRequest;
import com.ucloudstack.apis.UpdateVMOSResponse;
import com.ucloudstack.apis.UpdateVMSupportHotPlugRequest;
import com.ucloudstack.apis.UpdateVMSupportHotPlugResponse;
import com.ucloudstack.apis.UpdateVMUserDataRequest;
import com.ucloudstack.apis.UpdateVMUserDataResponse;
import com.ucloudstack.apis.UpdateVMVCPUBindingRequest;
import com.ucloudstack.apis.UpdateVMVCPUBindingResponse;
import com.ucloudstack.apis.AssociateVPCPeeringRequest;
import com.ucloudstack.apis.AssociateVPCPeeringResponse;
import com.ucloudstack.apis.CreateSubnetRequest;
import com.ucloudstack.apis.CreateSubnetResponse;
import com.ucloudstack.apis.CreateSubnetRouteRequest;
import com.ucloudstack.apis.CreateSubnetRouteResponse;
import com.ucloudstack.apis.CreateVPCRequest;
import com.ucloudstack.apis.CreateVPCResponse;
import com.ucloudstack.apis.DeleteSubnetRequest;
import com.ucloudstack.apis.DeleteSubnetResponse;
import com.ucloudstack.apis.DeleteSubnetRouteRequest;
import com.ucloudstack.apis.DeleteSubnetRouteResponse;
import com.ucloudstack.apis.DeleteVPCRequest;
import com.ucloudstack.apis.DeleteVPCResponse;
import com.ucloudstack.apis.DescribeSubnetRequest;
import com.ucloudstack.apis.DescribeSubnetResponse;
import com.ucloudstack.apis.DescribeSubnetRouteRequest;
import com.ucloudstack.apis.DescribeSubnetRouteResponse;
import com.ucloudstack.apis.DescribeVPCRequest;
import com.ucloudstack.apis.DescribeVPCResponse;
import com.ucloudstack.apis.DissociateVPCPeeringRequest;
import com.ucloudstack.apis.DissociateVPCPeeringResponse;
import com.ucloudstack.apis.GetSubnetAvailableIPQuotaRequest;
import com.ucloudstack.apis.GetSubnetAvailableIPQuotaResponse;
import com.ucloudstack.apis.ListAllocatedIPsInSubnetRequest;
import com.ucloudstack.apis.ListAllocatedIPsInSubnetResponse;
import com.ucloudstack.apis.ReplaceIPRequest;
import com.ucloudstack.apis.ReplaceIPResponse;
import com.ucloudstack.apis.UpdateSubnetRouteRequest;
import com.ucloudstack.apis.UpdateSubnetRouteResponse;
import com.ucloudstack.apis.BindEIPToVPNRequest;
import com.ucloudstack.apis.BindEIPToVPNResponse;
import com.ucloudstack.apis.CreateRemoteVPNGWRequest;
import com.ucloudstack.apis.CreateRemoteVPNGWResponse;
import com.ucloudstack.apis.CreateVPNGWRequest;
import com.ucloudstack.apis.CreateVPNGWResponse;
import com.ucloudstack.apis.CreateVPNTunnelRequest;
import com.ucloudstack.apis.CreateVPNTunnelResponse;
import com.ucloudstack.apis.DeleteRemoteVPNGWRequest;
import com.ucloudstack.apis.DeleteRemoteVPNGWResponse;
import com.ucloudstack.apis.DeleteVPNGWRequest;
import com.ucloudstack.apis.DeleteVPNGWResponse;
import com.ucloudstack.apis.DeleteVPNTunnelRequest;
import com.ucloudstack.apis.DeleteVPNTunnelResponse;
import com.ucloudstack.apis.DescribeRemoteVPNGWRequest;
import com.ucloudstack.apis.DescribeRemoteVPNGWResponse;
import com.ucloudstack.apis.DescribeVPNGWRequest;
import com.ucloudstack.apis.DescribeVPNGWResponse;
import com.ucloudstack.apis.DescribeVPNTunnelRequest;
import com.ucloudstack.apis.DescribeVPNTunnelResponse;
import com.ucloudstack.apis.GetPriceRequest;
import com.ucloudstack.apis.GetPriceResponse;
import com.ucloudstack.apis.GetVPNTunnelConfigRequest;
import com.ucloudstack.apis.GetVPNTunnelConfigResponse;
import com.ucloudstack.apis.UnbindEIPFromVPNRequest;
import com.ucloudstack.apis.UnbindEIPFromVPNResponse;
import com.ucloudstack.apis.UpdateVPNTunnelRequest;
import com.ucloudstack.apis.UpdateVPNTunnelResponse;
import com.ucloudstack.apis.UpgradeVPNGWToHARequest;
import com.ucloudstack.apis.UpgradeVPNGWToHAResponse;
import com.ucloudstack.apis.CreateWorkflowRequest;
import com.ucloudstack.apis.CreateWorkflowResponse;
import com.ucloudstack.apis.DeleteWorkflowRequest;
import com.ucloudstack.apis.DeleteWorkflowResponse;
import com.ucloudstack.apis.DescribeApplicationRequest;
import com.ucloudstack.apis.DescribeApplicationResponse;
import com.ucloudstack.apis.DescribeApplicationNodeRequest;
import com.ucloudstack.apis.DescribeApplicationNodeResponse;
import com.ucloudstack.apis.DescribeWorkflowRequest;
import com.ucloudstack.apis.DescribeWorkflowResponse;
import com.ucloudstack.apis.UpdateApplicationNodeRequest;
import com.ucloudstack.apis.UpdateApplicationNodeResponse;
import com.ucloudstack.apis.UpdateWorkflowRequest;
import com.ucloudstack.apis.UpdateWorkflowResponse;


public interface ClientInterface extends Client {

    /**
     * BindAlertTemplate - 绑定告警模版
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindAlertTemplateResponse bindAlertTemplate(BindAlertTemplateRequest request) throws OpenAPIException;


    /**
     * CreateAlertNotifyGroup - 创建告警通知组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateAlertNotifyGroupResponse createAlertNotifyGroup(CreateAlertNotifyGroupRequest request) throws OpenAPIException;


    /**
     * CreateAlertNotifyReceiver - 创建告警通知人
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateAlertNotifyReceiverResponse createAlertNotifyReceiver(CreateAlertNotifyReceiverRequest request) throws OpenAPIException;


    /**
     * CreateAlertNotifyWebhook - 创建告警回调接口
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateAlertNotifyWebhookResponse createAlertNotifyWebhook(CreateAlertNotifyWebhookRequest request) throws OpenAPIException;


    /**
     * CreateAlertTemplate - 创建告警模版
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateAlertTemplateResponse createAlertTemplate(CreateAlertTemplateRequest request) throws OpenAPIException;


    /**
     * CreateAlertTemplateRule - 创建告警模版规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateAlertTemplateRuleResponse createAlertTemplateRule(CreateAlertTemplateRuleRequest request) throws OpenAPIException;


    /**
     * CreateOPLogNotifyRule - 创建操作日志通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateOPLogNotifyRuleResponse createOPLogNotifyRule(CreateOPLogNotifyRuleRequest request) throws OpenAPIException;


    /**
     * CreateResourceEventNotifyRule - 创建资源事件通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateResourceEventNotifyRuleResponse createResourceEventNotifyRule(CreateResourceEventNotifyRuleRequest request) throws OpenAPIException;


    /**
     * DeleteAlertNotifyGroup - 删除告警通知组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteAlertNotifyGroupResponse deleteAlertNotifyGroup(DeleteAlertNotifyGroupRequest request) throws OpenAPIException;


    /**
     * DeleteAlertNotifyReceiver - 删除告警通知人
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteAlertNotifyReceiverResponse deleteAlertNotifyReceiver(DeleteAlertNotifyReceiverRequest request) throws OpenAPIException;


    /**
     * DeleteAlertNotifyWebhook - 删除告警回调接口
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteAlertNotifyWebhookResponse deleteAlertNotifyWebhook(DeleteAlertNotifyWebhookRequest request) throws OpenAPIException;


    /**
     * DeleteAlertTemplate - 删除告警模版
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteAlertTemplateResponse deleteAlertTemplate(DeleteAlertTemplateRequest request) throws OpenAPIException;


    /**
     * DeleteAlertTemplateRule - 删除告警模版规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteAlertTemplateRuleResponse deleteAlertTemplateRule(DeleteAlertTemplateRuleRequest request) throws OpenAPIException;


    /**
     * DeleteOPLogNotifyRule - 删除操作日志通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteOPLogNotifyRuleResponse deleteOPLogNotifyRule(DeleteOPLogNotifyRuleRequest request) throws OpenAPIException;


    /**
     * DeleteResourceEventNotifyRule - 删除资源事件通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteResourceEventNotifyRuleResponse deleteResourceEventNotifyRule(DeleteResourceEventNotifyRuleRequest request) throws OpenAPIException;


    /**
     * DescribeAlert - 查询告警
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAlertResponse describeAlert(DescribeAlertRequest request) throws OpenAPIException;


    /**
     * DescribeAlertNotifyGroup - 获取告警通知组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAlertNotifyGroupResponse describeAlertNotifyGroup(DescribeAlertNotifyGroupRequest request) throws OpenAPIException;


    /**
     * DescribeAlertNotifyReceiver - 获取告警通知人
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAlertNotifyReceiverResponse describeAlertNotifyReceiver(DescribeAlertNotifyReceiverRequest request) throws OpenAPIException;


    /**
     * DescribeAlertNotifyWebhook - 获取告警回调接口
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAlertNotifyWebhookResponse describeAlertNotifyWebhook(DescribeAlertNotifyWebhookRequest request) throws OpenAPIException;


    /**
     * DescribeAlertTemplate - 获取告警模版
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAlertTemplateResponse describeAlertTemplate(DescribeAlertTemplateRequest request) throws OpenAPIException;


    /**
     * DescribeAlertTemplateRule - 获取告警模版规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAlertTemplateRuleResponse describeAlertTemplateRule(DescribeAlertTemplateRuleRequest request) throws OpenAPIException;


    /**
     * DescribeAlertTemplateTarget - 获取告警模版绑定目标
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAlertTemplateTargetResponse describeAlertTemplateTarget(DescribeAlertTemplateTargetRequest request) throws OpenAPIException;


    /**
     * DescribeMetric - 获取监控指标
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMetricResponse describeMetric(DescribeMetricRequest request) throws OpenAPIException;


    /**
     * DescribeOPLogNotifyRule - 获取操作日志通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeOPLogNotifyRuleResponse describeOPLogNotifyRule(DescribeOPLogNotifyRuleRequest request) throws OpenAPIException;


    /**
     * DescribeResourceEventNotifyRule - 获取资源事件通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeResourceEventNotifyRuleResponse describeResourceEventNotifyRule(DescribeResourceEventNotifyRuleRequest request) throws OpenAPIException;


    /**
     * OperateAlert - 操作告警处理状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public OperateAlertResponse operateAlert(OperateAlertRequest request) throws OpenAPIException;


    /**
     * PrometheusQuery - 获取即时查询监控数据
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public PrometheusQueryResponse prometheusQuery(PrometheusQueryRequest request) throws OpenAPIException;


    /**
     * PrometheusQueryRange - 获取范围查询监控数据
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public PrometheusQueryRangeResponse prometheusQueryRange(PrometheusQueryRangeRequest request) throws OpenAPIException;


    /**
     * UnbindAlertTemplate - 解绑告警模版
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnbindAlertTemplateResponse unbindAlertTemplate(UnbindAlertTemplateRequest request) throws OpenAPIException;


    /**
     * UpdateAlertNotifyGroup - 更新告警通知组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateAlertNotifyGroupResponse updateAlertNotifyGroup(UpdateAlertNotifyGroupRequest request) throws OpenAPIException;


    /**
     * UpdateAlertNotifyReceiver - 更新告警通知人
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateAlertNotifyReceiverResponse updateAlertNotifyReceiver(UpdateAlertNotifyReceiverRequest request) throws OpenAPIException;


    /**
     * UpdateAlertNotifyWebhook - 更新告警回调接口
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateAlertNotifyWebhookResponse updateAlertNotifyWebhook(UpdateAlertNotifyWebhookRequest request) throws OpenAPIException;


    /**
     * UpdateAlertTemplate - 更新告警模版
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateAlertTemplateResponse updateAlertTemplate(UpdateAlertTemplateRequest request) throws OpenAPIException;


    /**
     * UpdateAlertTemplateRule - 更新告警通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateAlertTemplateRuleResponse updateAlertTemplateRule(UpdateAlertTemplateRuleRequest request) throws OpenAPIException;


    /**
     * UpdateOPLogNotifyRule - 更新操作日志通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateOPLogNotifyRuleResponse updateOPLogNotifyRule(UpdateOPLogNotifyRuleRequest request) throws OpenAPIException;


    /**
     * UpdateResourceEventNotifyRule - 更新资源事件通知规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateResourceEventNotifyRuleResponse updateResourceEventNotifyRule(UpdateResourceEventNotifyRuleRequest request) throws OpenAPIException;


    /**
     * AddASMember - 添加伸缩成员
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AddASMemberResponse addASMember(AddASMemberRequest request) throws OpenAPIException;


    /**
     * AttachLoadBalancer - 伸缩组关联lb
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachLoadBalancerResponse attachLoadBalancer(AttachLoadBalancerRequest request) throws OpenAPIException;


    /**
     * CreateASGroup - 创建伸缩组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateASGroupResponse createASGroup(CreateASGroupRequest request) throws OpenAPIException;


    /**
     * DeleteASGroup - 删除伸缩组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteASGroupResponse deleteASGroup(DeleteASGroupRequest request) throws OpenAPIException;


    /**
     * DescribeASGroup - 查询伸缩组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeASGroupResponse describeASGroup(DescribeASGroupRequest request) throws OpenAPIException;


    /**
     * DetachLoadBalancer - 伸缩组解关联lb
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetachLoadBalancerResponse detachLoadBalancer(DetachLoadBalancerRequest request) throws OpenAPIException;


    /**
     * DisableASGroup - 禁用伸缩组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DisableASGroupResponse disableASGroup(DisableASGroupRequest request) throws OpenAPIException;


    /**
     * EnableASGroup - 启用伸缩组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public EnableASGroupResponse enableASGroup(EnableASGroupRequest request) throws OpenAPIException;


    /**
     * RemoveASMember - 移除伸缩成员
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RemoveASMemberResponse removeASMember(RemoveASMemberRequest request) throws OpenAPIException;


    /**
     * UpdateASGroup - 更新伸缩组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateASGroupResponse updateASGroup(UpdateASGroupRequest request) throws OpenAPIException;


    /**
     * DescribeBillDetail - 获取账单详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeBillDetailResponse describeBillDetail(DescribeBillDetailRequest request) throws OpenAPIException;


    /**
     * DescribeBillOverView - 获取账单总览
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeBillOverViewResponse describeBillOverView(DescribeBillOverViewRequest request) throws OpenAPIException;


    /**
     * DescribeBillResource - 获取资源账单详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeBillResourceResponse describeBillResource(DescribeBillResourceRequest request) throws OpenAPIException;


    /**
     * DescribeOrder - 获取订单信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeOrderResponse describeOrder(DescribeOrderRequest request) throws OpenAPIException;


    /**
     * DescribePrice - 获取价格信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribePriceResponse describePrice(DescribePriceRequest request) throws OpenAPIException;


    /**
     * DescribeRecharge - 获取充值信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRechargeResponse describeRecharge(DescribeRechargeRequest request) throws OpenAPIException;


    /**
     * DescribeTransaction - 获取交易记录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTransactionResponse describeTransaction(DescribeTransactionRequest request) throws OpenAPIException;


    /**
     * DescribeWithdraw - 获取提现流水列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeWithdrawResponse describeWithdraw(DescribeWithdrawRequest request) throws OpenAPIException;


    /**
     * GetRenewPrice - 获取续费价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetRenewPriceResponse getRenewPrice(GetRenewPriceRequest request) throws OpenAPIException;


    /**
     * GetWithdrawableAmount - 获取账户可提现金额等信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetWithdrawableAmountResponse getWithdrawableAmount(GetWithdrawableAmountRequest request) throws OpenAPIException;


    /**
     * Recharge - 充值
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RechargeResponse recharge(RechargeRequest request) throws OpenAPIException;


    /**
     * RenewResource - 续费
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RenewResourceResponse renewResource(RenewResourceRequest request) throws OpenAPIException;


    /**
     * UpdateDiscount - 更新折扣
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDiscountResponse updateDiscount(UpdateDiscountRequest request) throws OpenAPIException;


    /**
     * UpdatePrice - 更新价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdatePriceResponse updatePrice(UpdatePriceRequest request) throws OpenAPIException;


    /**
     * Withdraw - 申请提现
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public WithdrawResponse withdraw(WithdrawRequest request) throws OpenAPIException;


    /**
     * CreateBucket - 创建桶
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateBucketResponse createBucket(CreateBucketRequest request) throws OpenAPIException;


    /**
     * CreateBucketLifecycleRule - 创建桶的生命周期
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateBucketLifecycleRuleResponse createBucketLifecycleRule(CreateBucketLifecycleRuleRequest request) throws OpenAPIException;


    /**
     * CreateDOSToken - 创建令牌
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDOSTokenResponse createDOSToken(CreateDOSTokenRequest request) throws OpenAPIException;


    /**
     * DOSLogin - 获取S3登录信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DOSLoginResponse dOSLogin(DOSLoginRequest request) throws OpenAPIException;


    /**
     * DeleteBucket - 删除桶
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) throws OpenAPIException;


    /**
     * DeleteBucketLifecycleRule - 删除桶的生命周期
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteBucketLifecycleRuleResponse deleteBucketLifecycleRule(DeleteBucketLifecycleRuleRequest request) throws OpenAPIException;


    /**
     * DeleteDOSToken - 删除令牌
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteDOSTokenResponse deleteDOSToken(DeleteDOSTokenRequest request) throws OpenAPIException;


    /**
     * DescribeBucketLifecycleRules - 桶的生命周期列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeBucketLifecycleRulesResponse describeBucketLifecycleRules(DescribeBucketLifecycleRulesRequest request) throws OpenAPIException;


    /**
     * DescribeBuckets - 桶列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeBucketsResponse describeBuckets(DescribeBucketsRequest request) throws OpenAPIException;


    /**
     * DescribeDOSToken - 获取令牌列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDOSTokenResponse describeDOSToken(DescribeDOSTokenRequest request) throws OpenAPIException;


    /**
     * FlushBucket - 清空桶数据
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public FlushBucketResponse flushBucket(FlushBucketRequest request) throws OpenAPIException;


    /**
     * UpdateBucketAccessType - 更新桶访问类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateBucketAccessTypeResponse updateBucketAccessType(UpdateBucketAccessTypeRequest request) throws OpenAPIException;


    /**
     * UpdateBucketEventLogging - 更新对象存储桶是否开启事件日志
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateBucketEventLoggingResponse updateBucketEventLogging(UpdateBucketEventLoggingRequest request) throws OpenAPIException;


    /**
     * UpdateBucketLifecycleRule - 更新桶的生命周期
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateBucketLifecycleRuleResponse updateBucketLifecycleRule(UpdateBucketLifecycleRuleRequest request) throws OpenAPIException;


    /**
     * UpdateBucketObjectLock - 更新桶的对象锁定开关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateBucketObjectLockResponse updateBucketObjectLock(UpdateBucketObjectLockRequest request) throws OpenAPIException;


    /**
     * UpdateBucketQuota - 更新存储桶配额
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateBucketQuotaResponse updateBucketQuota(UpdateBucketQuotaRequest request) throws OpenAPIException;


    /**
     * UpdateBucketVersioning - 更新桶的多版本开关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateBucketVersioningResponse updateBucketVersioning(UpdateBucketVersioningRequest request) throws OpenAPIException;


    /**
     * UpdateDOSToken - 更新令牌
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDOSTokenResponse updateDOSToken(UpdateDOSTokenRequest request) throws OpenAPIException;


    /**
     * CreateUser - 创建租户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws OpenAPIException;


    /**
     * DeleteCompany - 删除租户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteCompanyResponse deleteCompany(DeleteCompanyRequest request) throws OpenAPIException;


    /**
     * DescribeLoginWhitelist - 获取用户登录IP白名单
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeLoginWhitelistResponse describeLoginWhitelist(DescribeLoginWhitelistRequest request) throws OpenAPIException;


    /**
     * DescribeTenantResources - 获取租户资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTenantResourcesResponse describeTenantResources(DescribeTenantResourcesRequest request) throws OpenAPIException;


    /**
     * DescribeUser - 获取租户列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeUserResponse describeUser(DescribeUserRequest request) throws OpenAPIException;


    /**
     * FreezeUser - 冻结租户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public FreezeUserResponse freezeUser(FreezeUserRequest request) throws OpenAPIException;


    /**
     * RenameCompany - 重命名租户名称备注
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RenameCompanyResponse renameCompany(RenameCompanyRequest request) throws OpenAPIException;


    /**
     * UnFreezeUser - 解冻租户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnFreezeUserResponse unFreezeUser(UnFreezeUserRequest request) throws OpenAPIException;


    /**
     * UpdateCompanyEmail - 修改租户邮箱
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateCompanyEmailResponse updateCompanyEmail(UpdateCompanyEmailRequest request) throws OpenAPIException;


    /**
     * UpdateCompanyName - 更新租户名称
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateCompanyNameResponse updateCompanyName(UpdateCompanyNameRequest request) throws OpenAPIException;


    /**
     * UpdateLoginWhitelist - 设置用户登录IP白名单
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateLoginWhitelistResponse updateLoginWhitelist(UpdateLoginWhitelistRequest request) throws OpenAPIException;


    /**
     * CreateProductSpecification - 创建产品规格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateProductSpecificationResponse createProductSpecification(CreateProductSpecificationRequest request) throws OpenAPIException;


    /**
     * DeleteProductSpecification - 删除产品规格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteProductSpecificationResponse deleteProductSpecification(DeleteProductSpecificationRequest request) throws OpenAPIException;


    /**
     * DescribeProductSpecification - 查询产品规格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeProductSpecificationResponse describeProductSpecification(DescribeProductSpecificationRequest request) throws OpenAPIException;


    /**
     * DescribeProductSpecificationTemplate - 查询产品规格模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeProductSpecificationTemplateResponse describeProductSpecificationTemplate(DescribeProductSpecificationTemplateRequest request) throws OpenAPIException;


    /**
     * DescribeQuota - 查询配额列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws OpenAPIException;


    /**
     * DescribeQuotaUsage - 查询配额资源用量列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeQuotaUsageResponse describeQuotaUsage(DescribeQuotaUsageRequest request) throws OpenAPIException;


    /**
     * DescribeResourceInfo - 获取资源信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeResourceInfoResponse describeResourceInfo(DescribeResourceInfoRequest request) throws OpenAPIException;


    /**
     * DescribeSetAllocateUsage - 查询集群资源用量列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSetAllocateUsageResponse describeSetAllocateUsage(DescribeSetAllocateUsageRequest request) throws OpenAPIException;


    /**
     * GetConfig - 获取指定配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetConfigResponse getConfig(GetConfigRequest request) throws OpenAPIException;


    /**
     * GetFilterKeywords - 获取规格/价格/配额分类筛选关键字
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetFilterKeywordsResponse getFilterKeywords(GetFilterKeywordsRequest request) throws OpenAPIException;


    /**
     * GetRegionConfig - 获取地域指定配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetRegionConfigResponse getRegionConfig(GetRegionConfigRequest request) throws OpenAPIException;


    /**
     * GetSSOConfig - 获取sso配置信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetSSOConfigResponse getSSOConfig(GetSSOConfigRequest request) throws OpenAPIException;


    /**
     * ListGlobalConfigs - 按照类型和地域获取全局配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListGlobalConfigsResponse listGlobalConfigs(ListGlobalConfigsRequest request) throws OpenAPIException;


    /**
     * ListRegionConfigSyncStatus - 查询地域配置同步状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListRegionConfigSyncStatusResponse listRegionConfigSyncStatus(ListRegionConfigSyncStatusRequest request) throws OpenAPIException;


    /**
     * ListRegionConfigs - 按照类型和地域获取地域配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListRegionConfigsResponse listRegionConfigs(ListRegionConfigsRequest request) throws OpenAPIException;


    /**
     * SetAccountQuota - 设置资源配额
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetAccountQuotaResponse setAccountQuota(SetAccountQuotaRequest request) throws OpenAPIException;


    /**
     * UpdateConfig - 更新配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateConfigResponse updateConfig(UpdateConfigRequest request) throws OpenAPIException;


    /**
     * UpdateProductSpecification - 更新产品规格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateProductSpecificationResponse updateProductSpecification(UpdateProductSpecificationRequest request) throws OpenAPIException;


    /**
     * UpdateRegionConfig - 更新地域配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateRegionConfigResponse updateRegionConfig(UpdateRegionConfigRequest request) throws OpenAPIException;


    /**
     * VerifyEmailAvailability - 验证邮箱服务器可用性
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public VerifyEmailAvailabilityResponse verifyEmailAvailability(VerifyEmailAvailabilityRequest request) throws OpenAPIException;


    /**
     * CreateContainerImageRepository - 创建镜像仓库
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateContainerImageRepositoryResponse createContainerImageRepository(CreateContainerImageRepositoryRequest request) throws OpenAPIException;


    /**
     * DeleteContainerImage - 删除容器镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteContainerImageResponse deleteContainerImage(DeleteContainerImageRequest request) throws OpenAPIException;


    /**
     * DeleteContainerImageRepository - 删除镜像仓库
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteContainerImageRepositoryResponse deleteContainerImageRepository(DeleteContainerImageRepositoryRequest request) throws OpenAPIException;


    /**
     * DeleteContainerImageTag - 删除容器镜像tag
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteContainerImageTagResponse deleteContainerImageTag(DeleteContainerImageTagRequest request) throws OpenAPIException;


    /**
     * DescribeContainerImage - 查询容器镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeContainerImageResponse describeContainerImage(DescribeContainerImageRequest request) throws OpenAPIException;


    /**
     * DescribeContainerImageRepository - 查询镜像仓库
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeContainerImageRepositoryResponse describeContainerImageRepository(DescribeContainerImageRepositoryRequest request) throws OpenAPIException;


    /**
     * DescribeContainerImageTag - 查询容器镜像tags
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeContainerImageTagResponse describeContainerImageTag(DescribeContainerImageTagRequest request) throws OpenAPIException;


    /**
     * UpdateContainerImageRepository - 更新镜像仓库
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateContainerImageRepositoryResponse updateContainerImageRepository(UpdateContainerImageRepositoryRequest request) throws OpenAPIException;


    /**
     * BindStorageToDBS - 绑定存储系统到DBS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindStorageToDBSResponse bindStorageToDBS(BindStorageToDBSRequest request) throws OpenAPIException;


    /**
     * ChangeDBSGatewayEIP - 换绑备份网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ChangeDBSGatewayEIPResponse changeDBSGatewayEIP(ChangeDBSGatewayEIPRequest request) throws OpenAPIException;


    /**
     * CreateDBSBackupPlan - 创建备份计划
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDBSBackupPlanResponse createDBSBackupPlan(CreateDBSBackupPlanRequest request) throws OpenAPIException;


    /**
     * CreateDBSGateway - 创建DBS网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDBSGatewayResponse createDBSGateway(CreateDBSGatewayRequest request) throws OpenAPIException;


    /**
     * DeleteDBSBackup - 删除备份
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteDBSBackupResponse deleteDBSBackup(DeleteDBSBackupRequest request) throws OpenAPIException;


    /**
     * DeleteDBSBackupPlan - 删除备份计划
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteDBSBackupPlanResponse deleteDBSBackupPlan(DeleteDBSBackupPlanRequest request) throws OpenAPIException;


    /**
     * DeleteDBSGateway - 解绑备份网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteDBSGatewayResponse deleteDBSGateway(DeleteDBSGatewayRequest request) throws OpenAPIException;


    /**
     * DescribeDBSBackup - 获取备份
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDBSBackupResponse describeDBSBackup(DescribeDBSBackupRequest request) throws OpenAPIException;


    /**
     * DescribeDBSBackupPlan - 获取备份计划
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDBSBackupPlanResponse describeDBSBackupPlan(DescribeDBSBackupPlanRequest request) throws OpenAPIException;


    /**
     * DescribeDBSGateway - 获取DBS网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDBSGatewayResponse describeDBSGateway(DescribeDBSGatewayRequest request) throws OpenAPIException;


    /**
     * DescribeDBSRestoreRangeInfo - 查看可恢复时间段详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDBSRestoreRangeInfoResponse describeDBSRestoreRangeInfo(DescribeDBSRestoreRangeInfoRequest request) throws OpenAPIException;


    /**
     * DescribeDBSStorage - 获取DBS存储系统
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDBSStorageResponse describeDBSStorage(DescribeDBSStorageRequest request) throws OpenAPIException;


    /**
     * ExecDBSBackupPlan - 手动执行备份计划
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ExecDBSBackupPlanResponse execDBSBackupPlan(ExecDBSBackupPlanRequest request) throws OpenAPIException;


    /**
     * PauseDBSBackup - 暂停备份
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public PauseDBSBackupResponse pauseDBSBackup(PauseDBSBackupRequest request) throws OpenAPIException;


    /**
     * ResumeDBSBackup - 恢复定时备份
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ResumeDBSBackupResponse resumeDBSBackup(ResumeDBSBackupRequest request) throws OpenAPIException;


    /**
     * UnbindStorageFromDBS - 从DBS解绑存储系统
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnbindStorageFromDBSResponse unbindStorageFromDBS(UnbindStorageFromDBSRequest request) throws OpenAPIException;


    /**
     * UpdateDBSBackupPlan - 更新备份计划
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDBSBackupPlanResponse updateDBSBackupPlan(UpdateDBSBackupPlanRequest request) throws OpenAPIException;


    /**
     * UpdateDBSBackupPlanSimple - 更新备份计划的名称和remark
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDBSBackupPlanSimpleResponse updateDBSBackupPlanSimple(UpdateDBSBackupPlanSimpleRequest request) throws OpenAPIException;


    /**
     * UpdateDBSStorage - 更新DBS存储系统
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDBSStorageResponse updateDBSStorage(UpdateDBSStorageRequest request) throws OpenAPIException;


    /**
     * AttachDisk - 绑定磁盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws OpenAPIException;


    /**
     * AttachISO - 绑定iso
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachISOResponse attachISO(AttachISORequest request) throws OpenAPIException;


    /**
     * CloneDisk - 克隆硬盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CloneDiskResponse cloneDisk(CloneDiskRequest request) throws OpenAPIException;


    /**
     * CreateDisk - 创建数据盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDiskResponse createDisk(CreateDiskRequest request) throws OpenAPIException;


    /**
     * CreateDiskFromSnapshot - 从快照创建数据盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDiskFromSnapshotResponse createDiskFromSnapshot(CreateDiskFromSnapshotRequest request) throws OpenAPIException;


    /**
     * DeleteDisk - 删除磁盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteDiskResponse deleteDisk(DeleteDiskRequest request) throws OpenAPIException;


    /**
     * DescribeDisk - 查询磁盘信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDiskResponse describeDisk(DescribeDiskRequest request) throws OpenAPIException;


    /**
     * DescribeVMISO - 查询iso信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMISOResponse describeVMISO(DescribeVMISORequest request) throws OpenAPIException;


    /**
     * DetachDisk - 解绑磁盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws OpenAPIException;


    /**
     * DetachISO - 解绑iso
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetachISOResponse detachISO(DetachISORequest request) throws OpenAPIException;


    /**
     * GetCreateDiskPrice - 获取创建硬盘价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetCreateDiskPriceResponse getCreateDiskPrice(GetCreateDiskPriceRequest request) throws OpenAPIException;


    /**
     * GetDiskPrice - 获取数据盘的价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetDiskPriceResponse getDiskPrice(GetDiskPriceRequest request) throws OpenAPIException;


    /**
     * GetUpgradeDiskPrice - 获取升级虚拟硬盘的差价
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetUpgradeDiskPriceResponse getUpgradeDiskPrice(GetUpgradeDiskPriceRequest request) throws OpenAPIException;


    /**
     * UpdateDiskQoS - 设置硬盘QoS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDiskQoSResponse updateDiskQoS(UpdateDiskQoSRequest request) throws OpenAPIException;


    /**
     * UpgradeDisk - 升级虚拟硬盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeDiskResponse upgradeDisk(UpgradeDiskRequest request) throws OpenAPIException;


    /**
     * CreateSnapshot - 创建快照
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws OpenAPIException;


    /**
     * DeleteSnapshot - 删除快照
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws OpenAPIException;


    /**
     * DescribeSnapshot - 查询快照
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSnapshotResponse describeSnapshot(DescribeSnapshotRequest request) throws OpenAPIException;


    /**
     * RollbackSnapshot - 快照回滚
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RollbackSnapshotResponse rollbackSnapshot(RollbackSnapshotRequest request) throws OpenAPIException;


    /**
     * DeleteComputeClassDRS - 删除计算集群DRS规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteComputeClassDRSResponse deleteComputeClassDRS(DeleteComputeClassDRSRequest request) throws OpenAPIException;


    /**
     * DescribeComputeClassDRS - 查看计算集群DRS规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeComputeClassDRSResponse describeComputeClassDRS(DescribeComputeClassDRSRequest request) throws OpenAPIException;


    /**
     * DescribeComputeClassDRSRecords - 查看计算集群DRS记录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeComputeClassDRSRecordsResponse describeComputeClassDRSRecords(DescribeComputeClassDRSRecordsRequest request) throws OpenAPIException;


    /**
     * DescribeComputeClassDRSScore - 查看计算集群DRS评分
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeComputeClassDRSScoreResponse describeComputeClassDRSScore(DescribeComputeClassDRSScoreRequest request) throws OpenAPIException;


    /**
     * DescribeComputeClassDRSSuggestions - 查看计算集群DRS建议
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeComputeClassDRSSuggestionsResponse describeComputeClassDRSSuggestions(DescribeComputeClassDRSSuggestionsRequest request) throws OpenAPIException;


    /**
     * DescribeComputeClassVMsAddToDRSRule - 查看可加入计算集群规则的虚拟机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeComputeClassVMsAddToDRSRuleResponse describeComputeClassVMsAddToDRSRule(DescribeComputeClassVMsAddToDRSRuleRequest request) throws OpenAPIException;


    /**
     * SetComputeClassDRS - 设置计算集群DRS规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetComputeClassDRSResponse setComputeClassDRS(SetComputeClassDRSRequest request) throws OpenAPIException;


    /**
     * SetComputeClassDRSSuspend - 设置计算集群DRS是否暂停
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetComputeClassDRSSuspendResponse setComputeClassDRSSuspend(SetComputeClassDRSSuspendRequest request) throws OpenAPIException;


    /**
     * SetComputeClassDRSVMRule - 设置计算集群DRS虚拟机规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetComputeClassDRSVMRuleResponse setComputeClassDRSVMRule(SetComputeClassDRSVMRuleRequest request) throws OpenAPIException;


    /**
     * TriggerDRSOnce - 触发一次drs任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public TriggerDRSOnceResponse triggerDRSOnce(TriggerDRSOnceRequest request) throws OpenAPIException;


    /**
     * CreateDTSTask - 创建数据传输任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDTSTaskResponse createDTSTask(CreateDTSTaskRequest request) throws OpenAPIException;


    /**
     * CreateDataCheckTask - 创建数据校验任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDataCheckTaskResponse createDataCheckTask(CreateDataCheckTaskRequest request) throws OpenAPIException;


    /**
     * DeleteDTSTask - 删除 DTS 任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteDTSTaskResponse deleteDTSTask(DeleteDTSTaskRequest request) throws OpenAPIException;


    /**
     * DescribeDTSLog - 获取任务日志
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDTSLogResponse describeDTSLog(DescribeDTSLogRequest request) throws OpenAPIException;


    /**
     * DescribeDTSTask - 获取传输任务列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDTSTaskResponse describeDTSTask(DescribeDTSTaskRequest request) throws OpenAPIException;


    /**
     * DescribeDataCheckTask - 获取数据校验任务列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDataCheckTaskResponse describeDataCheckTask(DescribeDataCheckTaskRequest request) throws OpenAPIException;


    /**
     * GetDTSPrice - 获取数据传输任务价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetDTSPriceResponse getDTSPrice(GetDTSPriceRequest request) throws OpenAPIException;


    /**
     * GetDTSTaskConfigure - 获取传输任务配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetDTSTaskConfigureResponse getDTSTaskConfigure(GetDTSTaskConfigureRequest request) throws OpenAPIException;


    /**
     * GetDataCheckTaskResult - 获取数据校验任务详细结果
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetDataCheckTaskResultResponse getDataCheckTaskResult(GetDataCheckTaskResultRequest request) throws OpenAPIException;


    /**
     * RunDTSPrecheck - 执行数据传输预检查
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RunDTSPrecheckResponse runDTSPrecheck(RunDTSPrecheckRequest request) throws OpenAPIException;


    /**
     * StartDTSTask - 启动 DTS 任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public StartDTSTaskResponse startDTSTask(StartDTSTaskRequest request) throws OpenAPIException;


    /**
     * SuspendDTSTask - 暂停 DTS 任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SuspendDTSTaskResponse suspendDTSTask(SuspendDTSTaskRequest request) throws OpenAPIException;


    /**
     * UpdateDTSInstanceSpec - 更新 DTS 实例规格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDTSInstanceSpecResponse updateDTSInstanceSpec(UpdateDTSInstanceSpecRequest request) throws OpenAPIException;


    /**
     * UpdateDTSTaskConfigure - 更新数据传输任务配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDTSTaskConfigureResponse updateDTSTaskConfigure(UpdateDTSTaskConfigureRequest request) throws OpenAPIException;


    /**
     * CreateFlatNetwork - 创建扁平网络
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateFlatNetworkResponse createFlatNetwork(CreateFlatNetworkRequest request) throws OpenAPIException;


    /**
     * CreateFlatNetworkRoute - 创建扁平网络路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateFlatNetworkRouteResponse createFlatNetworkRoute(CreateFlatNetworkRouteRequest request) throws OpenAPIException;


    /**
     * DeleteFlatNetwork - 删除扁平网络
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteFlatNetworkResponse deleteFlatNetwork(DeleteFlatNetworkRequest request) throws OpenAPIException;


    /**
     * DeleteFlatNetworkRoute - 删除扁平网络路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteFlatNetworkRouteResponse deleteFlatNetworkRoute(DeleteFlatNetworkRouteRequest request) throws OpenAPIException;


    /**
     * DescribeFlatNetwork - 查询扁平网络
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeFlatNetworkResponse describeFlatNetwork(DescribeFlatNetworkRequest request) throws OpenAPIException;


    /**
     * DescribeFlatNetworkRoute - 查询扁平网络路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeFlatNetworkRouteResponse describeFlatNetworkRoute(DescribeFlatNetworkRouteRequest request) throws OpenAPIException;


    /**
     * UpdateFlatNetwork - 更新扁平网络
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateFlatNetworkResponse updateFlatNetwork(UpdateFlatNetworkRequest request) throws OpenAPIException;


    /**
     * UpdateFlatNetworkRoute - 更新扁平网络路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateFlatNetworkRouteResponse updateFlatNetworkRoute(UpdateFlatNetworkRouteRequest request) throws OpenAPIException;


    /**
     * CreateFS - 创建文件存储服务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateFSResponse createFS(CreateFSRequest request) throws OpenAPIException;


    /**
     * CreateFSDir - 创建目录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateFSDirResponse createFSDir(CreateFSDirRequest request) throws OpenAPIException;


    /**
     * DeleteFS - 删除文件存储服务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteFSResponse deleteFS(DeleteFSRequest request) throws OpenAPIException;


    /**
     * DeleteFSFile - 删除文件存储目录文件
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteFSFileResponse deleteFSFile(DeleteFSFileRequest request) throws OpenAPIException;


    /**
     * DescribeFS - 获取文件存储列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeFSResponse describeFS(DescribeFSRequest request) throws OpenAPIException;


    /**
     * DescribeFSFile - 获取文件存储目录文件
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeFSFileResponse describeFSFile(DescribeFSFileRequest request) throws OpenAPIException;


    /**
     * FSLogin - 创建文件存储会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public FSLoginResponse fSLogin(FSLoginRequest request) throws OpenAPIException;


    /**
     * GetFSPrice - 获取文件存储价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetFSPriceResponse getFSPrice(GetFSPriceRequest request) throws OpenAPIException;


    /**
     * UpgradeFS - 文件存储扩容
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeFSResponse upgradeFS(UpgradeFSRequest request) throws OpenAPIException;


    /**
     * AbortMigrateVMInstance - 取消虚机迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AbortMigrateVMInstanceResponse abortMigrateVMInstance(AbortMigrateVMInstanceRequest request) throws OpenAPIException;


    /**
     * CloseHostNUMASchedule - 关闭节点NUMA调度
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CloseHostNUMAScheduleResponse closeHostNUMASchedule(CloseHostNUMAScheduleRequest request) throws OpenAPIException;


    /**
     * DescribeHostPods - 获取物理机上Pod信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeHostPodsResponse describeHostPods(DescribeHostPodsRequest request) throws OpenAPIException;


    /**
     * DescribeHostVMInstance - 获取物理机上虚拟机信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeHostVMInstanceResponse describeHostVMInstance(DescribeHostVMInstanceRequest request) throws OpenAPIException;


    /**
     * DescribeNode - 获取物理机节点信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNodeResponse describeNode(DescribeNodeRequest request) throws OpenAPIException;


    /**
     * DescribeNodeNUMAInfo - 获取节点NUMANode信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNodeNUMAInfoResponse describeNodeNUMAInfo(DescribeNodeNUMAInfoRequest request) throws OpenAPIException;


    /**
     * DescribeVMHost - 获取虚拟机物理机信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMHostResponse describeVMHost(DescribeVMHostRequest request) throws OpenAPIException;


    /**
     * DiskLightOff - 磁盘关灯
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DiskLightOffResponse diskLightOff(DiskLightOffRequest request) throws OpenAPIException;


    /**
     * DiskLightOn - 磁盘点灯
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DiskLightOnResponse diskLightOn(DiskLightOnRequest request) throws OpenAPIException;


    /**
     * GetNodeCPUGovernor - 获取节点 CPU 电源模式
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetNodeCPUGovernorResponse getNodeCPUGovernor(GetNodeCPUGovernorRequest request) throws OpenAPIException;


    /**
     * ListGPUs - 获取GPU信息列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListGPUsResponse listGPUs(ListGPUsRequest request) throws OpenAPIException;


    /**
     * LockHost - 锁定物理机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public LockHostResponse lockHost(LockHostRequest request) throws OpenAPIException;


    /**
     * MigrateVMInstance - 虚机迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public MigrateVMInstanceResponse migrateVMInstance(MigrateVMInstanceRequest request) throws OpenAPIException;


    /**
     * OpenHostNUMASchedule - 开启节点NUMA调度
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public OpenHostNUMAScheduleResponse openHostNUMASchedule(OpenHostNUMAScheduleRequest request) throws OpenAPIException;


    /**
     * UnlockHost - 解锁物理机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnlockHostResponse unlockHost(UnlockHostRequest request) throws OpenAPIException;


    /**
     * UpdateNodeCPUGovernor - 更新节点 CPU 电源模式
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNodeCPUGovernorResponse updateNodeCPUGovernor(UpdateNodeCPUGovernorRequest request) throws OpenAPIException;


    /**
     * UpdateVFLogicCount - 调整逻辑VF数量限制
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVFLogicCountResponse updateVFLogicCount(UpdateVFLogicCountRequest request) throws OpenAPIException;


    /**
     * AllocateNodeHostDevice - 分配外置设备给租户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateNodeHostDeviceResponse allocateNodeHostDevice(AllocateNodeHostDeviceRequest request) throws OpenAPIException;


    /**
     * CreateNodeHostDevice - 创建外置设备
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateNodeHostDeviceResponse createNodeHostDevice(CreateNodeHostDeviceRequest request) throws OpenAPIException;


    /**
     * DeleteNodeHostDevice - 弹出/删除外置设备
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteNodeHostDeviceResponse deleteNodeHostDevice(DeleteNodeHostDeviceRequest request) throws OpenAPIException;


    /**
     * DescribeNodeHostDevice - 扫描外置设备
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNodeHostDeviceResponse describeNodeHostDevice(DescribeNodeHostDeviceRequest request) throws OpenAPIException;


    /**
     * AbortCustomImage - 取消制作虚拟机镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AbortCustomImageResponse abortCustomImage(AbortCustomImageRequest request) throws OpenAPIException;


    /**
     * AbortImageMultipartUpload - 取消本地上传镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AbortImageMultipartUploadResponse abortImageMultipartUpload(AbortImageMultipartUploadRequest request) throws OpenAPIException;


    /**
     * CloneCustomImageToBaseImage - 自制镜像复制成基础镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CloneCustomImageToBaseImageResponse cloneCustomImageToBaseImage(CloneCustomImageToBaseImageRequest request) throws OpenAPIException;


    /**
     * CompleteImageMultipartUpload - 合并本地上传镜像分片
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CompleteImageMultipartUploadResponse completeImageMultipartUpload(CompleteImageMultipartUploadRequest request) throws OpenAPIException;


    /**
     * CreateCustomImage - 制作虚拟机镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request) throws OpenAPIException;


    /**
     * DeleteBaseImage - 删除基础镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteBaseImageResponse deleteBaseImage(DeleteBaseImageRequest request) throws OpenAPIException;


    /**
     * DeleteCustomImage - 删除主机镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteCustomImageResponse deleteCustomImage(DeleteCustomImageRequest request) throws OpenAPIException;


    /**
     * DescribeBaseImage - 获取基础镜像权限信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeBaseImageResponse describeBaseImage(DescribeBaseImageRequest request) throws OpenAPIException;


    /**
     * DescribeImage - 获取镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeImageResponse describeImage(DescribeImageRequest request) throws OpenAPIException;


    /**
     * DescribeImageOSVersions - 查询镜像系统规格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeImageOSVersionsResponse describeImageOSVersions(DescribeImageOSVersionsRequest request) throws OpenAPIException;


    /**
     * GetImageDownloadURL - 获取镜像下载地址
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetImageDownloadURLResponse getImageDownloadURL(GetImageDownloadURLRequest request) throws OpenAPIException;


    /**
     * ImportImage - 上传镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ImportImageResponse importImage(ImportImageRequest request) throws OpenAPIException;


    /**
     * UpdateImage - 修改镜像属性
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) throws OpenAPIException;


    /**
     * CountTenantResourceByStatus - 获取资源状态统计图表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CountTenantResourceByStatusResponse countTenantResourceByStatus(CountTenantResourceByStatusRequest request) throws OpenAPIException;


    /**
     * CreateOnSiteInspection - 创建一键巡检报告
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateOnSiteInspectionResponse createOnSiteInspection(CreateOnSiteInspectionRequest request) throws OpenAPIException;


    /**
     * CreateResourceUsage - 创建资源使用情况报告
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateResourceUsageResponse createResourceUsage(CreateResourceUsageRequest request) throws OpenAPIException;


    /**
     * DeleteOnSiteInspection - 删除一键巡检报告
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteOnSiteInspectionResponse deleteOnSiteInspection(DeleteOnSiteInspectionRequest request) throws OpenAPIException;


    /**
     * DeleteResourceUsage - 删除资源使用情况报告
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteResourceUsageResponse deleteResourceUsage(DeleteResourceUsageRequest request) throws OpenAPIException;


    /**
     * DescribeNetworkTopology - 获取网络拓扑信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNetworkTopologyResponse describeNetworkTopology(DescribeNetworkTopologyRequest request) throws OpenAPIException;


    /**
     * DescribeResourceChart - 获取资源用量图表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeResourceChartResponse describeResourceChart(DescribeResourceChartRequest request) throws OpenAPIException;


    /**
     * DescribeResourceCondition - 获取资源事件状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeResourceConditionResponse describeResourceCondition(DescribeResourceConditionRequest request) throws OpenAPIException;


    /**
     * DescribeResourceEvent - 获取资源事件
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeResourceEventResponse describeResourceEvent(DescribeResourceEventRequest request) throws OpenAPIException;


    /**
     * GetOnSiteInspection - 获取巡检报告详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetOnSiteInspectionResponse getOnSiteInspection(GetOnSiteInspectionRequest request) throws OpenAPIException;


    /**
     * GetResourceUsage - 获取资源使用情况详细信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetResourceUsageResponse getResourceUsage(GetResourceUsageRequest request) throws OpenAPIException;


    /**
     * ListExpiredResources - 查询过期资源，根据资源类型过滤，排除销毁、销毁中和已删除的资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListExpiredResourcesResponse listExpiredResources(ListExpiredResourcesRequest request) throws OpenAPIException;


    /**
     * ListOnSiteInspections - 获取巡检报告列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListOnSiteInspectionsResponse listOnSiteInspections(ListOnSiteInspectionsRequest request) throws OpenAPIException;


    /**
     * ListResourceUsages - 获取资源使用情况列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListResourceUsagesResponse listResourceUsages(ListResourceUsagesRequest request) throws OpenAPIException;


    /**
     * RetryResourceUsage - 重试重新生成资源使用情况报告
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RetryResourceUsageResponse retryResourceUsage(RetryResourceUsageRequest request) throws OpenAPIException;


    /**
     * AllocateEIP - 申请弹性IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateEIPResponse allocateEIP(AllocateEIPRequest request) throws OpenAPIException;


    /**
     * BindEIP - 绑定弹性IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindEIPResponse bindEIP(BindEIPRequest request) throws OpenAPIException;


    /**
     * CheckIPInuse - 查询IP是否使用中
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CheckIPInuseResponse checkIPInuse(CheckIPInuseRequest request) throws OpenAPIException;


    /**
     * DescribeEIP - 获取弹性IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeEIPResponse describeEIP(DescribeEIPRequest request) throws OpenAPIException;


    /**
     * GetEIPDiffPrice - 获取EIP差价
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetEIPDiffPriceResponse getEIPDiffPrice(GetEIPDiffPriceRequest request) throws OpenAPIException;


    /**
     * GetEIPPrice - 获取弹性IP价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetEIPPriceResponse getEIPPrice(GetEIPPriceRequest request) throws OpenAPIException;


    /**
     * ModifyEIPBandwidth - 调整带宽
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ModifyEIPBandwidthResponse modifyEIPBandwidth(ModifyEIPBandwidthRequest request) throws OpenAPIException;


    /**
     * ReleaseEIP - 释放弹性IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ReleaseEIPResponse releaseEIP(ReleaseEIPRequest request) throws OpenAPIException;


    /**
     * UnBindEIP - 解绑弹性IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnBindEIPResponse unBindEIP(UnBindEIPRequest request) throws OpenAPIException;


    /**
     * AddNodesToIsolationGroup - 添加节点到隔离组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AddNodesToIsolationGroupResponse addNodesToIsolationGroup(AddNodesToIsolationGroupRequest request) throws OpenAPIException;


    /**
     * AddVMToIsolationGroup - 添加VM到隔离组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AddVMToIsolationGroupResponse addVMToIsolationGroup(AddVMToIsolationGroupRequest request) throws OpenAPIException;


    /**
     * CreateIsolationGroup - 创建隔离组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateIsolationGroupResponse createIsolationGroup(CreateIsolationGroupRequest request) throws OpenAPIException;


    /**
     * DeleteIsolationGroup - 删除隔离组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteIsolationGroupResponse deleteIsolationGroup(DeleteIsolationGroupRequest request) throws OpenAPIException;


    /**
     * DescribeIsolationGroups - 获取隔离组信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeIsolationGroupsResponse describeIsolationGroups(DescribeIsolationGroupsRequest request) throws OpenAPIException;


    /**
     * DescribeVMAddToVMGroup - 获取可加入隔离组的虚拟机信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMAddToVMGroupResponse describeVMAddToVMGroup(DescribeVMAddToVMGroupRequest request) throws OpenAPIException;


    /**
     * RemoveNodesFromIsolationGroup - 从隔离组移除节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RemoveNodesFromIsolationGroupResponse removeNodesFromIsolationGroup(RemoveNodesFromIsolationGroupRequest request) throws OpenAPIException;


    /**
     * RemoveVMFromIsolationGroup - 从隔离组移除VM
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RemoveVMFromIsolationGroupResponse removeVMFromIsolationGroup(RemoveVMFromIsolationGroupRequest request) throws OpenAPIException;


    /**
     * UpdateIsolationGroup - 更新隔离组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateIsolationGroupResponse updateIsolationGroup(UpdateIsolationGroupRequest request) throws OpenAPIException;


    /**
     * AllocateK8SSession - 申请console会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateK8SSessionResponse allocateK8SSession(AllocateK8SSessionRequest request) throws OpenAPIException;


    /**
     * AllocateK8STerminal - 申请console会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateK8STerminalResponse allocateK8STerminal(AllocateK8STerminalRequest request) throws OpenAPIException;


    /**
     * AllocateNativeNodeSSHSession - 申请原生节点SSH会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateNativeNodeSSHSessionResponse allocateNativeNodeSSHSession(AllocateNativeNodeSSHSessionRequest request) throws OpenAPIException;


    /**
     * AllocateNativeNodeVNCSession - 申请原生节点VNC会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateNativeNodeVNCSessionResponse allocateNativeNodeVNCSession(AllocateNativeNodeVNCSessionRequest request) throws OpenAPIException;


    /**
     * AttachClusterEIP - 绑定k8s集群外网IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachClusterEIPResponse attachClusterEIP(AttachClusterEIPRequest request) throws OpenAPIException;


    /**
     * CreateCluster - 创建k8s集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws OpenAPIException;


    /**
     * CreateNativeNode - 创建k8s集群原生节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateNativeNodeResponse createNativeNode(CreateNativeNodeRequest request) throws OpenAPIException;


    /**
     * DeleteCluster - 删除k8s集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws OpenAPIException;


    /**
     * DeleteNativeNode - 删除k8s集群原生节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteNativeNodeResponse deleteNativeNode(DeleteNativeNodeRequest request) throws OpenAPIException;


    /**
     * DescribeCluster - 查询k8s集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeClusterResponse describeCluster(DescribeClusterRequest request) throws OpenAPIException;


    /**
     * DescribeNativeNode - 查询k8s集群原生节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNativeNodeResponse describeNativeNode(DescribeNativeNodeRequest request) throws OpenAPIException;


    /**
     * DetachClusterEIP - 解绑k8s集群外网IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetachClusterEIPResponse detachClusterEIP(DetachClusterEIPRequest request) throws OpenAPIException;


    /**
     * ForwardCluster - 代理k8s集群请求
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ForwardClusterResponse forwardCluster(ForwardClusterRequest request) throws OpenAPIException;


    /**
     * GetClusterPaymentOfPremium - 获取K8S修改配置后的差价
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetClusterPaymentOfPremiumResponse getClusterPaymentOfPremium(GetClusterPaymentOfPremiumRequest request) throws OpenAPIException;


    /**
     * GetClusterPrice - 获取K8S价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetClusterPriceResponse getClusterPrice(GetClusterPriceRequest request) throws OpenAPIException;


    /**
     * GetContainerLogs - 查询容器日志
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetContainerLogsResponse getContainerLogs(GetContainerLogsRequest request) throws OpenAPIException;


    /**
     * GetNativeNodePrice - 获取K8S原生节点价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetNativeNodePriceResponse getNativeNodePrice(GetNativeNodePriceRequest request) throws OpenAPIException;


    /**
     * UpdateCluster - 更新k8s集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws OpenAPIException;


    /**
     * UpdateClusterCapacity - 更新k8s集群容量配额
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateClusterCapacityResponse updateClusterCapacity(UpdateClusterCapacityRequest request) throws OpenAPIException;


    /**
     * UpdateNativeNodeInstanceStatus - 更新k8s集群NativeNode实例状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNativeNodeInstanceStatusResponse updateNativeNodeInstanceStatus(UpdateNativeNodeInstanceStatusRequest request) throws OpenAPIException;


    /**
     * UpdateNativeNodeWAN - 更新k8s集群NativeNode外网
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNativeNodeWANResponse updateNativeNodeWAN(UpdateNativeNodeWANRequest request) throws OpenAPIException;


    /**
     * BindEIPToLB - 绑定 eip 到 LB
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindEIPToLBResponse bindEIPToLB(BindEIPToLBRequest request) throws OpenAPIException;


    /**
     * CreateCertificate - 创建证书
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws OpenAPIException;


    /**
     * CreateLB - 创建负载均衡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateLBResponse createLB(CreateLBRequest request) throws OpenAPIException;


    /**
     * CreateRS - 添加服务节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateRSResponse createRS(CreateRSRequest request) throws OpenAPIException;


    /**
     * CreateVS - 创建VS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateVSResponse createVS(CreateVSRequest request) throws OpenAPIException;


    /**
     * CreateVSPolicy - 创建转发规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateVSPolicyResponse createVSPolicy(CreateVSPolicyRequest request) throws OpenAPIException;


    /**
     * DeleteCertificate - 删除证书
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws OpenAPIException;


    /**
     * DeleteLB - 删除负载均衡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteLBResponse deleteLB(DeleteLBRequest request) throws OpenAPIException;


    /**
     * DeleteRS - 删除服务节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteRSResponse deleteRS(DeleteRSRequest request) throws OpenAPIException;


    /**
     * DeleteVS - 删除VS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVSResponse deleteVS(DeleteVSRequest request) throws OpenAPIException;


    /**
     * DeleteVSPolicy - 删除转发规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVSPolicyResponse deleteVSPolicy(DeleteVSPolicyRequest request) throws OpenAPIException;


    /**
     * DescribeCertificate - 查询证书
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeCertificateResponse describeCertificate(DescribeCertificateRequest request) throws OpenAPIException;


    /**
     * DescribeLB - 获取负载均衡信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeLBResponse describeLB(DescribeLBRequest request) throws OpenAPIException;


    /**
     * DescribeRS - 获取RS信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRSResponse describeRS(DescribeRSRequest request) throws OpenAPIException;


    /**
     * DescribeVS - 获取VS信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVSResponse describeVS(DescribeVSRequest request) throws OpenAPIException;


    /**
     * DescribeVSPolicy - 查询转发规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVSPolicyResponse describeVSPolicy(DescribeVSPolicyRequest request) throws OpenAPIException;


    /**
     * DisableRS - 禁用节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DisableRSResponse disableRS(DisableRSRequest request) throws OpenAPIException;


    /**
     * DowngradeLB - 降级LB
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DowngradeLBResponse downgradeLB(DowngradeLBRequest request) throws OpenAPIException;


    /**
     * EnableRS - 启用节点
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public EnableRSResponse enableRS(EnableRSRequest request) throws OpenAPIException;


    /**
     * GetLBPrice - 获取负载均衡价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetLBPriceResponse getLBPrice(GetLBPriceRequest request) throws OpenAPIException;


    /**
     * UnbindEIPFromLB - 从 LB 解绑 eip
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnbindEIPFromLBResponse unbindEIPFromLB(UnbindEIPFromLBRequest request) throws OpenAPIException;


    /**
     * UpdateLBAccessLogForLive - 负载均衡日志实时查看开关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateLBAccessLogForLiveResponse updateLBAccessLogForLive(UpdateLBAccessLogForLiveRequest request) throws OpenAPIException;


    /**
     * UpdateLBLog - 更新负载均衡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateLBLogResponse updateLBLog(UpdateLBLogRequest request) throws OpenAPIException;


    /**
     * UpdateRS - 更改RS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateRSResponse updateRS(UpdateRSRequest request) throws OpenAPIException;


    /**
     * UpdateSGFromLB - 新增/更新 SG 到 LB
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateSGFromLBResponse updateSGFromLB(UpdateSGFromLBRequest request) throws OpenAPIException;


    /**
     * UpdateVS - 更新VS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVSResponse updateVS(UpdateVSRequest request) throws OpenAPIException;


    /**
     * UpdateVSPolicy - 更新VS转发规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVSPolicyResponse updateVSPolicy(UpdateVSPolicyRequest request) throws OpenAPIException;


    /**
     * UpgradeLB - 升级LB
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeLBResponse upgradeLB(UpgradeLBRequest request) throws OpenAPIException;


    /**
     * UpgradeLBToHA - 升级为高可用版本
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeLBToHAResponse upgradeLBToHA(UpgradeLBToHARequest request) throws OpenAPIException;


    /**
     * DescribeOPLogs - 获取操作日志
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeOPLogsResponse describeOPLogs(DescribeOPLogsRequest request) throws OpenAPIException;


    /**
     * ChangeMemberPassword - 由管理员为子账号更改密码
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ChangeMemberPasswordResponse changeMemberPassword(ChangeMemberPasswordRequest request) throws OpenAPIException;


    /**
     * CreateAdmin - 创建管理员
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateAdminResponse createAdmin(CreateAdminRequest request) throws OpenAPIException;


    /**
     * CreateSubMember - 创建用户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSubMemberResponse createSubMember(CreateSubMemberRequest request) throws OpenAPIException;


    /**
     * DeleteAdmin - 删除管理员
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteAdminResponse deleteAdmin(DeleteAdminRequest request) throws OpenAPIException;


    /**
     * DeleteMember - 删除用户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) throws OpenAPIException;


    /**
     * DescribeMember - 获取账号列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMemberResponse describeMember(DescribeMemberRequest request) throws OpenAPIException;


    /**
     * DescribePermission - 获取用户访问控制接口信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribePermissionResponse describePermission(DescribePermissionRequest request) throws OpenAPIException;


    /**
     * FreezeSubMember - 冻结子账号
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public FreezeSubMemberResponse freezeSubMember(FreezeSubMemberRequest request) throws OpenAPIException;


    /**
     * GetMemberInfo - 获取用户访问控制信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetMemberInfoResponse getMemberInfo(GetMemberInfoRequest request) throws OpenAPIException;


    /**
     * ListAdmin - 列出管理员
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListAdminResponse listAdmin(ListAdminRequest request) throws OpenAPIException;


    /**
     * LoginByPassword - 密码登录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public LoginByPasswordResponse loginByPassword(LoginByPasswordRequest request) throws OpenAPIException;


    /**
     * LogoutToken - 登出
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public LogoutTokenResponse logoutToken(LogoutTokenRequest request) throws OpenAPIException;


    /**
     * UnFreezeSubMember - 解冻子账号
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnFreezeSubMemberResponse unFreezeSubMember(UnFreezeSubMemberRequest request) throws OpenAPIException;


    /**
     * UpdateDigitalCert - 更新数字证书
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDigitalCertResponse updateDigitalCert(UpdateDigitalCertRequest request) throws OpenAPIException;


    /**
     * UpdateMemberEmail - 修改账号邮箱
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateMemberEmailResponse updateMemberEmail(UpdateMemberEmailRequest request) throws OpenAPIException;


    /**
     * UpdateMemberName - 修改账号名称
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateMemberNameResponse updateMemberName(UpdateMemberNameRequest request) throws OpenAPIException;


    /**
     * UpdateMemberOAuth2UniqueID - 修改账号OAuth2唯一标识ID
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateMemberOAuth2UniqueIDResponse updateMemberOAuth2UniqueID(UpdateMemberOAuth2UniqueIDRequest request) throws OpenAPIException;


    /**
     * UpdateMemberPhone - 修改账号安全手机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateMemberPhoneResponse updateMemberPhone(UpdateMemberPhoneRequest request) throws OpenAPIException;


    /**
     * CreateMulticastGroup - 创建组播组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateMulticastGroupResponse createMulticastGroup(CreateMulticastGroupRequest request) throws OpenAPIException;


    /**
     * DeleteMulticastGroup - 删除组播组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteMulticastGroupResponse deleteMulticastGroup(DeleteMulticastGroupRequest request) throws OpenAPIException;


    /**
     * DescribeMulticastGroup - 获取组播组列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMulticastGroupResponse describeMulticastGroup(DescribeMulticastGroupRequest request) throws OpenAPIException;


    /**
     * UpdateMulticastGroup - 更新组播组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateMulticastGroupResponse updateMulticastGroup(UpdateMulticastGroupRequest request) throws OpenAPIException;


    /**
     * ApplyMySQLParamTpl - 应用MySQL参数模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ApplyMySQLParamTplResponse applyMySQLParamTpl(ApplyMySQLParamTplRequest request) throws OpenAPIException;


    /**
     * CreateMySQL - 创建MySQL
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateMySQLResponse createMySQL(CreateMySQLRequest request) throws OpenAPIException;


    /**
     * CreateMySQLParamTpl - 创建MySQL参数模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateMySQLParamTplResponse createMySQLParamTpl(CreateMySQLParamTplRequest request) throws OpenAPIException;


    /**
     * CreateMySQLSlave - 创建MySQL从库
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateMySQLSlaveResponse createMySQLSlave(CreateMySQLSlaveRequest request) throws OpenAPIException;


    /**
     * DeleteMySQL - 删除MySQL
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteMySQLResponse deleteMySQL(DeleteMySQLRequest request) throws OpenAPIException;


    /**
     * DeleteMySQLParamTpl - 删除MySQL参数模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteMySQLParamTplResponse deleteMySQLParamTpl(DeleteMySQLParamTplRequest request) throws OpenAPIException;


    /**
     * DescribeMySQL - 查询MySQL信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMySQLResponse describeMySQL(DescribeMySQLRequest request) throws OpenAPIException;


    /**
     * DescribeMySQLConfigParam - 获取MySQL配置参数
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMySQLConfigParamResponse describeMySQLConfigParam(DescribeMySQLConfigParamRequest request) throws OpenAPIException;


    /**
     * DescribeMySQLErrorLogs - 查询 MySQL 错误日志
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMySQLErrorLogsResponse describeMySQLErrorLogs(DescribeMySQLErrorLogsRequest request) throws OpenAPIException;


    /**
     * DescribeMySQLParamTpl - 查询MySQL参数模板详细信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMySQLParamTplResponse describeMySQLParamTpl(DescribeMySQLParamTplRequest request) throws OpenAPIException;


    /**
     * DescribeMySQLParamTpls - 查询MySQL参数模板列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMySQLParamTplsResponse describeMySQLParamTpls(DescribeMySQLParamTplsRequest request) throws OpenAPIException;


    /**
     * DescribeMySQLSlowLogRecords - 查询 MySQL 慢日志记录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeMySQLSlowLogRecordsResponse describeMySQLSlowLogRecords(DescribeMySQLSlowLogRecordsRequest request) throws OpenAPIException;


    /**
     * DescribePMAURL - 获取 PMA URL
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribePMAURLResponse describePMAURL(DescribePMAURLRequest request) throws OpenAPIException;


    /**
     * DowngradeMySQL - 降级MySQL
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DowngradeMySQLResponse downgradeMySQL(DowngradeMySQLRequest request) throws OpenAPIException;


    /**
     * GetMySQLPrice - 查询MySQL价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetMySQLPriceResponse getMySQLPrice(GetMySQLPriceRequest request) throws OpenAPIException;


    /**
     * ResetMySQLPassword - 修改MySQL密码
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ResetMySQLPasswordResponse resetMySQLPassword(ResetMySQLPasswordRequest request) throws OpenAPIException;


    /**
     * RestartMySQLInstance - 重启 MySQL 实例
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RestartMySQLInstanceResponse restartMySQLInstance(RestartMySQLInstanceRequest request) throws OpenAPIException;


    /**
     * UpdateMySQLConfigParam - 更新MySQL配置参数
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateMySQLConfigParamResponse updateMySQLConfigParam(UpdateMySQLConfigParamRequest request) throws OpenAPIException;


    /**
     * UpdateMySQLParamTpl - 更新MySQL参数模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateMySQLParamTplResponse updateMySQLParamTpl(UpdateMySQLParamTplRequest request) throws OpenAPIException;


    /**
     * UpgradeMySQL - 升级MySQL
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeMySQLResponse upgradeMySQL(UpgradeMySQLRequest request) throws OpenAPIException;


    /**
     * UpgradeMySQLToHA - 升级为高可用版本
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeMySQLToHAResponse upgradeMySQLToHA(UpgradeMySQLToHARequest request) throws OpenAPIException;


    /**
     * BindEIPToNATGW - 绑定EIP到NAT网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindEIPToNATGWResponse bindEIPToNATGW(BindEIPToNATGWRequest request) throws OpenAPIException;


    /**
     * CreateNATGW - 创建NAT网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateNATGWResponse createNATGW(CreateNATGWRequest request) throws OpenAPIException;


    /**
     * CreateNATGWPolicy - 创建端口转发
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateNATGWPolicyResponse createNATGWPolicy(CreateNATGWPolicyRequest request) throws OpenAPIException;


    /**
     * CreateNATGWRule - 添加NAT网关规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateNATGWRuleResponse createNATGWRule(CreateNATGWRuleRequest request) throws OpenAPIException;


    /**
     * DeleteNATGW - 删除NAT网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteNATGWResponse deleteNATGW(DeleteNATGWRequest request) throws OpenAPIException;


    /**
     * DeleteNATGWPolicy - 删除端口转发
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteNATGWPolicyResponse deleteNATGWPolicy(DeleteNATGWPolicyRequest request) throws OpenAPIException;


    /**
     * DeleteNATGWRule - 删除NAT网关规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteNATGWRuleResponse deleteNATGWRule(DeleteNATGWRuleRequest request) throws OpenAPIException;


    /**
     * DescribeNATGW - 获取NAT网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNATGWResponse describeNATGW(DescribeNATGWRequest request) throws OpenAPIException;


    /**
     * DescribeNATGWPolicy - 查询端口转发
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNATGWPolicyResponse describeNATGWPolicy(DescribeNATGWPolicyRequest request) throws OpenAPIException;


    /**
     * DescribeNATGWRule - 获取NAT网关规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNATGWRuleResponse describeNATGWRule(DescribeNATGWRuleRequest request) throws OpenAPIException;


    /**
     * GetNATGWPrice - 获取NAT网关价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetNATGWPriceResponse getNATGWPrice(GetNATGWPriceRequest request) throws OpenAPIException;


    /**
     * UnbindEIPFromNATGW - 从NAT网关上解绑EIP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnbindEIPFromNATGWResponse unbindEIPFromNATGW(UnbindEIPFromNATGWRequest request) throws OpenAPIException;


    /**
     * UpdateNATGWPolicy - 更新端口转发
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNATGWPolicyResponse updateNATGWPolicy(UpdateNATGWPolicyRequest request) throws OpenAPIException;


    /**
     * UpdateNATGWRule - 修改NAT网关规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNATGWRuleResponse updateNATGWRule(UpdateNATGWRuleRequest request) throws OpenAPIException;


    /**
     * UpdateSGFromNATGW - 修改NAT网关的安全组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateSGFromNATGWResponse updateSGFromNATGW(UpdateSGFromNATGWRequest request) throws OpenAPIException;


    /**
     * UpgradeNATGWToHA - 升级为高可用版本
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeNATGWToHAResponse upgradeNATGWToHA(UpgradeNATGWToHARequest request) throws OpenAPIException;


    /**
     * AttachNIC - 绑定网卡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachNICResponse attachNIC(AttachNICRequest request) throws OpenAPIException;


    /**
     * CheckMACInUse - 查询MAC是否使用中
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CheckMACInUseResponse checkMACInUse(CheckMACInUseRequest request) throws OpenAPIException;


    /**
     * CreateNIC - 创建弹性网卡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateNICResponse createNIC(CreateNICRequest request) throws OpenAPIException;


    /**
     * DeleteNIC - 删除弹性网卡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteNICResponse deleteNIC(DeleteNICRequest request) throws OpenAPIException;


    /**
     * DescribeNIC - 查询弹性网卡信息,如果指定资源查询就是查询资源绑定的所有网卡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeNICResponse describeNIC(DescribeNICRequest request) throws OpenAPIException;


    /**
     * DetachNIC - 解绑网卡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetachNICResponse detachNIC(DetachNICRequest request) throws OpenAPIException;


    /**
     * GetCreateNICPrice - 获取弹性IP价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetCreateNICPriceResponse getCreateNICPrice(GetCreateNICPriceRequest request) throws OpenAPIException;


    /**
     * GetUpdateNICPrice - 获取更新弹性网卡价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetUpdateNICPriceResponse getUpdateNICPrice(GetUpdateNICPriceRequest request) throws OpenAPIException;


    /**
     * UpdateNICIP - 更新网卡的IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNICIPResponse updateNICIP(UpdateNICIPRequest request) throws OpenAPIException;


    /**
     * UpdateNICIPBandwidth - 修改弹性外网网卡的IP带宽
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNICIPBandwidthResponse updateNICIPBandwidth(UpdateNICIPBandwidthRequest request) throws OpenAPIException;


    /**
     * UpdateNICMAC - 修改网卡的MAC
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNICMACResponse updateNICMAC(UpdateNICMACRequest request) throws OpenAPIException;


    /**
     * UpdateNICPF - 修改网卡的物理型号
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNICPFResponse updateNICPF(UpdateNICPFRequest request) throws OpenAPIException;


    /**
     * UpdateNICTrafficShaping - 更新网卡流量整形信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateNICTrafficShapingResponse updateNICTrafficShaping(UpdateNICTrafficShapingRequest request) throws OpenAPIException;


    /**
     * AbortMigratePaaSInstance - PaaS 取消计算迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AbortMigratePaaSInstanceResponse abortMigratePaaSInstance(AbortMigratePaaSInstanceRequest request) throws OpenAPIException;


    /**
     * DescribeAuditLog - 获取审计日志
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeAuditLogResponse describeAuditLog(DescribeAuditLogRequest request) throws OpenAPIException;


    /**
     * DescribePaaSInstance - 获取 PaaS 实例信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribePaaSInstanceResponse describePaaSInstance(DescribePaaSInstanceRequest request) throws OpenAPIException;


    /**
     * DescribeParametersHistories - 查询参数修改记录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeParametersHistoriesResponse describeParametersHistories(DescribeParametersHistoriesRequest request) throws OpenAPIException;


    /**
     * GetConnectionInfo - 获取连接信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetConnectionInfoResponse getConnectionInfo(GetConnectionInfoRequest request) throws OpenAPIException;


    /**
     * GetMigratePaaSInstancePrice - 获取PaaS 计算迁移差价
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetMigratePaaSInstancePriceResponse getMigratePaaSInstancePrice(GetMigratePaaSInstancePriceRequest request) throws OpenAPIException;


    /**
     * GetMigratePaaSStoragePrice - 获取PaaS产品存储热迁移差价
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetMigratePaaSStoragePriceResponse getMigratePaaSStoragePrice(GetMigratePaaSStoragePriceRequest request) throws OpenAPIException;


    /**
     * MigratePaaSInstance - PaaS 计算迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public MigratePaaSInstanceResponse migratePaaSInstance(MigratePaaSInstanceRequest request) throws OpenAPIException;


    /**
     * MigratePaaSStorage - PaaS产品存储热迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public MigratePaaSStorageResponse migratePaaSStorage(MigratePaaSStorageRequest request) throws OpenAPIException;


    /**
     * RecoverPaaSConfig - 恢复 PaaS 产品配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RecoverPaaSConfigResponse recoverPaaSConfig(RecoverPaaSConfigRequest request) throws OpenAPIException;


    /**
     * StartPaaSInstance - Paas 实例开机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public StartPaaSInstanceResponse startPaaSInstance(StartPaaSInstanceRequest request) throws OpenAPIException;


    /**
     * StopPaaSInstance - Paas 实例关机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public StopPaaSInstanceResponse stopPaaSInstance(StopPaaSInstanceRequest request) throws OpenAPIException;


    /**
     * UpdateAuditLog - 开关数据库审计
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateAuditLogResponse updateAuditLog(UpdateAuditLogRequest request) throws OpenAPIException;


    /**
     * UpdatePaaSDiskQoS - 设置PaaS产品硬盘QoS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdatePaaSDiskQoSResponse updatePaaSDiskQoS(UpdatePaaSDiskQoSRequest request) throws OpenAPIException;


    /**
     * UpdateTerminationPolicy - 修改 PaaS产品 删除保护
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateTerminationPolicyResponse updateTerminationPolicy(UpdateTerminationPolicyRequest request) throws OpenAPIException;


    /**
     * CreateOrchTask - 创建编排任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateOrchTaskResponse createOrchTask(CreateOrchTaskRequest request) throws OpenAPIException;


    /**
     * DeleteOrchTask - 删除编排任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteOrchTaskResponse deleteOrchTask(DeleteOrchTaskRequest request) throws OpenAPIException;


    /**
     * DescribeOrchTask - 查询编排任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeOrchTaskResponse describeOrchTask(DescribeOrchTaskRequest request) throws OpenAPIException;


    /**
     * DescribeOrchTaskType - 查询支持的编排任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeOrchTaskTypeResponse describeOrchTaskType(DescribeOrchTaskTypeRequest request) throws OpenAPIException;


    /**
     * OperateOrchTask - 操作编排任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public OperateOrchTaskResponse operateOrchTask(OperateOrchTaskRequest request) throws OpenAPIException;


    /**
     * UpdateOrchTask - 更新编排任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateOrchTaskResponse updateOrchTask(UpdateOrchTaskRequest request) throws OpenAPIException;


    /**
     * CreateOSS - 创建对象存储服务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateOSSResponse createOSS(CreateOSSRequest request) throws OpenAPIException;


    /**
     * DeleteOSS - 删除对象存储服务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteOSSResponse deleteOSS(DeleteOSSRequest request) throws OpenAPIException;


    /**
     * DescribeOSS - 获取对象存储列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeOSSResponse describeOSS(DescribeOSSRequest request) throws OpenAPIException;


    /**
     * DowngradeOSS - 对象存储降配
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DowngradeOSSResponse downgradeOSS(DowngradeOSSRequest request) throws OpenAPIException;


    /**
     * GetOSSPrice - 获取对象存储价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetOSSPriceResponse getOSSPrice(GetOSSPriceRequest request) throws OpenAPIException;


    /**
     * ResetOSSPassword - 重置对象存储密码
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ResetOSSPasswordResponse resetOSSPassword(ResetOSSPasswordRequest request) throws OpenAPIException;


    /**
     * UpgradeOSS - 对象存储升级
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeOSSResponse upgradeOSS(UpgradeOSSRequest request) throws OpenAPIException;


    /**
     * AttachPlatformStorageDisk - 绑定平台通用存储云盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachPlatformStorageDiskResponse attachPlatformStorageDisk(AttachPlatformStorageDiskRequest request) throws OpenAPIException;


    /**
     * CreatePlatformStorageDisk - 创建平台通用存储云盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreatePlatformStorageDiskResponse createPlatformStorageDisk(CreatePlatformStorageDiskRequest request) throws OpenAPIException;


    /**
     * DeletePlatformStorageDisk - 删除平台通用存储云盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeletePlatformStorageDiskResponse deletePlatformStorageDisk(DeletePlatformStorageDiskRequest request) throws OpenAPIException;


    /**
     * DescribePlatformStorage - 查询平台通用存储状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribePlatformStorageResponse describePlatformStorage(DescribePlatformStorageRequest request) throws OpenAPIException;


    /**
     * DescribePlatformStorageDisk - 查询平台通用存储云盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribePlatformStorageDiskResponse describePlatformStorageDisk(DescribePlatformStorageDiskRequest request) throws OpenAPIException;


    /**
     * ResizePlatformStorageDisk - 扩容平台通用存储云盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ResizePlatformStorageDiskResponse resizePlatformStorageDisk(ResizePlatformStorageDiskRequest request) throws OpenAPIException;


    /**
     * AllocatePM - 分配裸金属给租户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocatePMResponse allocatePM(AllocatePMRequest request) throws OpenAPIException;


    /**
     * AllocatePMVNCSession - 申请裸金属VNC远程控制会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocatePMVNCSessionResponse allocatePMVNCSession(AllocatePMVNCSessionRequest request) throws OpenAPIException;


    /**
     * CancelInstallTaskV2 - 取消装机任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CancelInstallTaskV2Response cancelInstallTaskV2(CancelInstallTaskV2Request request) throws OpenAPIException;


    /**
     * CleanPXE - 清理PXE环境
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CleanPXEResponse cleanPXE(CleanPXERequest request) throws OpenAPIException;


    /**
     * CloneBMCType - 克隆BMC类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CloneBMCTypeResponse cloneBMCType(CloneBMCTypeRequest request) throws OpenAPIException;


    /**
     * CloneKickstartTemplate - 克隆Kickstart模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CloneKickstartTemplateResponse cloneKickstartTemplate(CloneKickstartTemplateRequest request) throws OpenAPIException;


    /**
     * ClonePartitionTemplate - 克隆分区模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ClonePartitionTemplateResponse clonePartitionTemplate(ClonePartitionTemplateRequest request) throws OpenAPIException;


    /**
     * CloseKVMSessionV2 - 关闭KVM会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CloseKVMSessionV2Response closeKVMSessionV2(CloseKVMSessionV2Request request) throws OpenAPIException;


    /**
     * CreateBMCType - 创建BMC类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateBMCTypeResponse createBMCType(CreateBMCTypeRequest request) throws OpenAPIException;


    /**
     * CreateInstallProfile - 创建装机配置模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateInstallProfileResponse createInstallProfile(CreateInstallProfileRequest request) throws OpenAPIException;


    /**
     * CreateInstallTaskV2 - 创建装机任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateInstallTaskV2Response createInstallTaskV2(CreateInstallTaskV2Request request) throws OpenAPIException;


    /**
     * CreateKVMSessionV2 - 创建KVM会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateKVMSessionV2Response createKVMSessionV2(CreateKVMSessionV2Request request) throws OpenAPIException;


    /**
     * CreateKickstartTemplate - 创建Kickstart模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateKickstartTemplateResponse createKickstartTemplate(CreateKickstartTemplateRequest request) throws OpenAPIException;


    /**
     * CreateOSMediaV2 - 创建系统镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateOSMediaV2Response createOSMediaV2(CreateOSMediaV2Request request) throws OpenAPIException;


    /**
     * CreatePMV2 - 创建裸金属
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreatePMV2Response createPMV2(CreatePMV2Request request) throws OpenAPIException;


    /**
     * CreatePartitionTemplate - 创建分区模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreatePartitionTemplateResponse createPartitionTemplate(CreatePartitionTemplateRequest request) throws OpenAPIException;


    /**
     * DeleteBMCType - 删除BMC类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteBMCTypeResponse deleteBMCType(DeleteBMCTypeRequest request) throws OpenAPIException;


    /**
     * DeleteInstallProfile - 删除装机配置模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteInstallProfileResponse deleteInstallProfile(DeleteInstallProfileRequest request) throws OpenAPIException;


    /**
     * DeleteInstallTaskV2 - 删除装机任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteInstallTaskV2Response deleteInstallTaskV2(DeleteInstallTaskV2Request request) throws OpenAPIException;


    /**
     * DeleteKickstartTemplate - 删除Kickstart模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteKickstartTemplateResponse deleteKickstartTemplate(DeleteKickstartTemplateRequest request) throws OpenAPIException;


    /**
     * DeleteOSMediaV2 - 删除系统镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteOSMediaV2Response deleteOSMediaV2(DeleteOSMediaV2Request request) throws OpenAPIException;


    /**
     * DeletePMV2 - 删除裸金属
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeletePMV2Response deletePMV2(DeletePMV2Request request) throws OpenAPIException;


    /**
     * DeletePartitionTemplate - 删除分区模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeletePartitionTemplateResponse deletePartitionTemplate(DeletePartitionTemplateRequest request) throws OpenAPIException;


    /**
     * DetectBMCTypeV2 - 检测BMC类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetectBMCTypeV2Response detectBMCTypeV2(DetectBMCTypeV2Request request) throws OpenAPIException;


    /**
     * DiscoverDHCPServers - 发现DHCP服务器
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DiscoverDHCPServersResponse discoverDHCPServers(DiscoverDHCPServersRequest request) throws OpenAPIException;


    /**
     * DiscoverPMHardwareV2 - 硬件发现
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DiscoverPMHardwareV2Response discoverPMHardwareV2(DiscoverPMHardwareV2Request request) throws OpenAPIException;


    /**
     * GetBMCType - 获取BMC类型详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetBMCTypeResponse getBMCType(GetBMCTypeRequest request) throws OpenAPIException;


    /**
     * GetDHCPNetwork - 获取DHCP网络配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetDHCPNetworkResponse getDHCPNetwork(GetDHCPNetworkRequest request) throws OpenAPIException;


    /**
     * GetDHCPServerState - 获取DHCP服务器状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetDHCPServerStateResponse getDHCPServerState(GetDHCPServerStateRequest request) throws OpenAPIException;


    /**
     * GetInstallLogsV2 - 获取装机日志
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetInstallLogsV2Response getInstallLogsV2(GetInstallLogsV2Request request) throws OpenAPIException;


    /**
     * GetInstallStatusByTaskIDV2 - 按任务ID获取装机状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetInstallStatusByTaskIDV2Response getInstallStatusByTaskIDV2(GetInstallStatusByTaskIDV2Request request) throws OpenAPIException;


    /**
     * GetInstallTaskV2 - 获取装机任务详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetInstallTaskV2Response getInstallTaskV2(GetInstallTaskV2Request request) throws OpenAPIException;


    /**
     * GetKickstartTemplate - 获取Kickstart模板详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetKickstartTemplateResponse getKickstartTemplate(GetKickstartTemplateRequest request) throws OpenAPIException;


    /**
     * GetLatestInstallConfig - 获取裸金属最近一次安装配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetLatestInstallConfigResponse getLatestInstallConfig(GetLatestInstallConfigRequest request) throws OpenAPIException;


    /**
     * GetOSMediaV2 - 获取系统镜像详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetOSMediaV2Response getOSMediaV2(GetOSMediaV2Request request) throws OpenAPIException;


    /**
     * GetPMHardwareV2 - 获取硬件信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetPMHardwareV2Response getPMHardwareV2(GetPMHardwareV2Request request) throws OpenAPIException;


    /**
     * GetPMJNLPFileV2 - 获取JNLP文件
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetPMJNLPFileV2Response getPMJNLPFileV2(GetPMJNLPFileV2Request request) throws OpenAPIException;


    /**
     * GetPMPowerStatusV2 - 获取电源状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetPMPowerStatusV2Response getPMPowerStatusV2(GetPMPowerStatusV2Request request) throws OpenAPIException;


    /**
     * GetPartitionTemplate - 获取分区模板详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetPartitionTemplateResponse getPartitionTemplate(GetPartitionTemplateRequest request) throws OpenAPIException;


    /**
     * ListBMCTypes - 获取BMC类型列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListBMCTypesResponse listBMCTypes(ListBMCTypesRequest request) throws OpenAPIException;


    /**
     * ListInstallProfiles - 获取装机配置模板列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListInstallProfilesResponse listInstallProfiles(ListInstallProfilesRequest request) throws OpenAPIException;


    /**
     * ListInstallTasksV2 - 获取装机任务列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListInstallTasksV2Response listInstallTasksV2(ListInstallTasksV2Request request) throws OpenAPIException;


    /**
     * ListKVMSessionsV2 - 获取KVM会话列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListKVMSessionsV2Response listKVMSessionsV2(ListKVMSessionsV2Request request) throws OpenAPIException;


    /**
     * ListKickstartTemplates - 获取Kickstart模板列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListKickstartTemplatesResponse listKickstartTemplates(ListKickstartTemplatesRequest request) throws OpenAPIException;


    /**
     * ListOSMediaV2 - 获取系统镜像列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListOSMediaV2Response listOSMediaV2(ListOSMediaV2Request request) throws OpenAPIException;


    /**
     * ListPMV2 - 获取裸金属列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListPMV2Response listPMV2(ListPMV2Request request) throws OpenAPIException;


    /**
     * ListPartitionTemplates - 获取分区模板列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListPartitionTemplatesResponse listPartitionTemplates(ListPartitionTemplatesRequest request) throws OpenAPIException;


    /**
     * PowerControlPMV2 - 电源控制
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public PowerControlPMV2Response powerControlPMV2(PowerControlPMV2Request request) throws OpenAPIException;


    /**
     * PreviewKickstartCommands - 预览Kickstart分区命令
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public PreviewKickstartCommandsResponse previewKickstartCommands(PreviewKickstartCommandsRequest request) throws OpenAPIException;


    /**
     * PreviewKickstartTemplate - 预览Kickstart模板渲染结果
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public PreviewKickstartTemplateResponse previewKickstartTemplate(PreviewKickstartTemplateRequest request) throws OpenAPIException;


    /**
     * RecyclePM - 从租户回收裸金属
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RecyclePMResponse recyclePM(RecyclePMRequest request) throws OpenAPIException;


    /**
     * RetryInstallTaskV2 - 重试装机任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RetryInstallTaskV2Response retryInstallTaskV2(RetryInstallTaskV2Request request) throws OpenAPIException;


    /**
     * SetDHCPNetwork - 设置DHCP网络配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetDHCPNetworkResponse setDHCPNetwork(SetDHCPNetworkRequest request) throws OpenAPIException;


    /**
     * SetDefaultPartitionTemplate - 设置默认分区模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetDefaultPartitionTemplateResponse setDefaultPartitionTemplate(SetDefaultPartitionTemplateRequest request) throws OpenAPIException;


    /**
     * TestBMCType - 测试BMC类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public TestBMCTypeResponse testBMCType(TestBMCTypeRequest request) throws OpenAPIException;


    /**
     * TestPMIPMIV2 - 测试IPMI连接
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public TestPMIPMIV2Response testPMIPMIV2(TestPMIPMIV2Request request) throws OpenAPIException;


    /**
     * UpdateBMCType - 更新BMC类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateBMCTypeResponse updateBMCType(UpdateBMCTypeRequest request) throws OpenAPIException;


    /**
     * UpdateInstallProfile - 更新装机配置模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateInstallProfileResponse updateInstallProfile(UpdateInstallProfileRequest request) throws OpenAPIException;


    /**
     * UpdateKickstartTemplate - 更新Kickstart模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateKickstartTemplateResponse updateKickstartTemplate(UpdateKickstartTemplateRequest request) throws OpenAPIException;


    /**
     * UpdatePMV2 - 更新裸金属
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdatePMV2Response updatePMV2(UpdatePMV2Request request) throws OpenAPIException;


    /**
     * UpdatePartitionTemplate - 更新分区模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdatePartitionTemplateResponse updatePartitionTemplate(UpdatePartitionTemplateRequest request) throws OpenAPIException;


    /**
     * ValidateKickstartTemplate - 验证Kickstart模板语法
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ValidateKickstartTemplateResponse validateKickstartTemplate(ValidateKickstartTemplateRequest request) throws OpenAPIException;


    /**
     * ValidatePartitionConfig - 验证分区配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ValidatePartitionConfigResponse validatePartitionConfig(ValidatePartitionConfigRequest request) throws OpenAPIException;


    /**
     * CreateMemberTag - 添加角色授权
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateMemberTagResponse createMemberTag(CreateMemberTagRequest request) throws OpenAPIException;


    /**
     * CreateProject - 创建项目
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws OpenAPIException;


    /**
     * CreateRole - 创建租户级自定义角色
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws OpenAPIException;


    /**
     * DeleteMemberTag - 删除角色授权
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteMemberTagResponse deleteMemberTag(DeleteMemberTagRequest request) throws OpenAPIException;


    /**
     * DeleteProject - 删除项目
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws OpenAPIException;


    /**
     * DeleteRole - 删除租户级自定义角色
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws OpenAPIException;


    /**
     * DescribeProduct - 获取产品类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeProductResponse describeProduct(DescribeProductRequest request) throws OpenAPIException;


    /**
     * DisableCompanyProductType - 租户关闭服务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DisableCompanyProductTypeResponse disableCompanyProductType(DisableCompanyProductTypeRequest request) throws OpenAPIException;


    /**
     * EnableCompanyProductType - 租户启用服务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public EnableCompanyProductTypeResponse enableCompanyProductType(EnableCompanyProductTypeRequest request) throws OpenAPIException;


    /**
     * GetProject - 获取项目详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws OpenAPIException;


    /**
     * GetRole - 查询角色详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetRoleResponse getRole(GetRoleRequest request) throws OpenAPIException;


    /**
     * ListMemberTags - 查询角色授权列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListMemberTagsResponse listMemberTags(ListMemberTagsRequest request) throws OpenAPIException;


    /**
     * ListProductPermissions - 获取租户可用接口
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListProductPermissionsResponse listProductPermissions(ListProductPermissionsRequest request) throws OpenAPIException;


    /**
     * ListProductResources - 获取产品资源关系
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListProductResourcesResponse listProductResources(ListProductResourcesRequest request) throws OpenAPIException;


    /**
     * ListProductTypeCompanys - 获取某产品已授权的租户信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListProductTypeCompanysResponse listProductTypeCompanys(ListProductTypeCompanysRequest request) throws OpenAPIException;


    /**
     * ListProjects - 查询项目列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws OpenAPIException;


    /**
     * ListRoles - 查询租户级角色列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws OpenAPIException;


    /**
     * MoveProjectResource - 修改资源所在的项目
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public MoveProjectResourceResponse moveProjectResource(MoveProjectResourceRequest request) throws OpenAPIException;


    /**
     * RenameProject - 重命名项目名称备注
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RenameProjectResponse renameProject(RenameProjectRequest request) throws OpenAPIException;


    /**
     * RenameRole - 重命名角色名称备注
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RenameRoleResponse renameRole(RenameRoleRequest request) throws OpenAPIException;


    /**
     * UpdateRolePermission - 修改角色权限
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateRolePermissionResponse updateRolePermission(UpdateRolePermissionRequest request) throws OpenAPIException;


    /**
     * DescribeRecycledResource - 获取回收站资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRecycledResourceResponse describeRecycledResource(DescribeRecycledResourceRequest request) throws OpenAPIException;


    /**
     * RollbackResource - 恢复资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RollbackResourceResponse rollbackResource(RollbackResourceRequest request) throws OpenAPIException;


    /**
     * TerminateResource - 销毁资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public TerminateResourceResponse terminateResource(TerminateResourceRequest request) throws OpenAPIException;


    /**
     * AllocateRedisConsoleSession - 申请redis控制台会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateRedisConsoleSessionResponse allocateRedisConsoleSession(AllocateRedisConsoleSessionRequest request) throws OpenAPIException;


    /**
     * ApplyRedisConfigFile - 应用Redis参数模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ApplyRedisConfigFileResponse applyRedisConfigFile(ApplyRedisConfigFileRequest request) throws OpenAPIException;


    /**
     * CreateRedis - 创建redis实例
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateRedisResponse createRedis(CreateRedisRequest request) throws OpenAPIException;


    /**
     * CreateRedisConfigFile - 创建配置文件
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateRedisConfigFileResponse createRedisConfigFile(CreateRedisConfigFileRequest request) throws OpenAPIException;


    /**
     * CreateSlaveRedis - 创建Redis从库
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSlaveRedisResponse createSlaveRedis(CreateSlaveRedisRequest request) throws OpenAPIException;


    /**
     * DeleteRedis - 删除redis实例
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteRedisResponse deleteRedis(DeleteRedisRequest request) throws OpenAPIException;


    /**
     * DeleteRedisConfigFile - 删除配置文件
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteRedisConfigFileResponse deleteRedisConfigFile(DeleteRedisConfigFileRequest request) throws OpenAPIException;


    /**
     * DescribeRedis - 查询redis实例
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRedisResponse describeRedis(DescribeRedisRequest request) throws OpenAPIException;


    /**
     * DescribeRedisConfigFile - 查询配置文件列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRedisConfigFileResponse describeRedisConfigFile(DescribeRedisConfigFileRequest request) throws OpenAPIException;


    /**
     * DescribeRedisConfigParams - 查询配置文件详情
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRedisConfigParamsResponse describeRedisConfigParams(DescribeRedisConfigParamsRequest request) throws OpenAPIException;


    /**
     * DescribeRedisSlowlog - 慢日志查询
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRedisSlowlogResponse describeRedisSlowlog(DescribeRedisSlowlogRequest request) throws OpenAPIException;


    /**
     * DowngradeRedis - 降级redis内存
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DowngradeRedisResponse downgradeRedis(DowngradeRedisRequest request) throws OpenAPIException;


    /**
     * FlushRedis - 清空数据
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public FlushRedisResponse flushRedis(FlushRedisRequest request) throws OpenAPIException;


    /**
     * GetRedisPrice - 获取redis创建升级价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetRedisPriceResponse getRedisPrice(GetRedisPriceRequest request) throws OpenAPIException;


    /**
     * UpdateRedisConfigParams - 更新配置项
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateRedisConfigParamsResponse updateRedisConfigParams(UpdateRedisConfigParamsRequest request) throws OpenAPIException;


    /**
     * UpdateRedisPassword - 更新redis密码
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateRedisPasswordResponse updateRedisPassword(UpdateRedisPasswordRequest request) throws OpenAPIException;


    /**
     * UpgradeRedis - 升级redis内存
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeRedisResponse upgradeRedis(UpgradeRedisRequest request) throws OpenAPIException;


    /**
     * UpgradeRedisToHA - 升级至主备版本
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeRedisToHAResponse upgradeRedisToHA(UpgradeRedisToHARequest request) throws OpenAPIException;


    /**
     * AddRegion - 纳管新地域
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AddRegionResponse addRegion(AddRegionRequest request) throws OpenAPIException;


    /**
     * DescribeRegion - 获取租户已授权地域
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRegionResponse describeRegion(DescribeRegionRequest request) throws OpenAPIException;


    /**
     * ModifyNameAndRemark - 修改地域下资源名称和备注
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ModifyNameAndRemarkResponse modifyNameAndRemark(ModifyNameAndRemarkRequest request) throws OpenAPIException;


    /**
     * UpdateAdminRegion - 修改管理员地域授权
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateAdminRegionResponse updateAdminRegion(UpdateAdminRegionRequest request) throws OpenAPIException;


    /**
     * UpdateCompanyRegion - 修改租户地域授权
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateCompanyRegionResponse updateCompanyRegion(UpdateCompanyRegionRequest request) throws OpenAPIException;


    /**
     * UpdateRegion - 更新地域
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateRegionResponse updateRegion(UpdateRegionRequest request) throws OpenAPIException;


    /**
     * CreateResourceFromTemplate - 通过模板创建资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateResourceFromTemplateResponse createResourceFromTemplate(CreateResourceFromTemplateRequest request) throws OpenAPIException;


    /**
     * CreateResourceTemplate - 创建资源模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateResourceTemplateResponse createResourceTemplate(CreateResourceTemplateRequest request) throws OpenAPIException;


    /**
     * DeleteResourceTemplate - 删除资源模版
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteResourceTemplateResponse deleteResourceTemplate(DeleteResourceTemplateRequest request) throws OpenAPIException;


    /**
     * DescribeResourceTemplate - 查询资源模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeResourceTemplateResponse describeResourceTemplate(DescribeResourceTemplateRequest request) throws OpenAPIException;


    /**
     * UpdateResourceTemplate - 更新资源模板
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateResourceTemplateResponse updateResourceTemplate(UpdateResourceTemplateRequest request) throws OpenAPIException;


    /**
     * S3Login - 获取S3登录信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public S3LoginResponse s3Login(S3LoginRequest request) throws OpenAPIException;


    /**
     * CreateDirectConnect - 创建DirectConnect专线接入
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateDirectConnectResponse createDirectConnect(CreateDirectConnectRequest request) throws OpenAPIException;


    /**
     * CreateSegment - 创建外网线路
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSegmentResponse createSegment(CreateSegmentRequest request) throws OpenAPIException;


    /**
     * CreateSegmentRoute - 创建外网线路路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSegmentRouteResponse createSegmentRoute(CreateSegmentRouteRequest request) throws OpenAPIException;


    /**
     * DeleteDirectConnect - 删除DirectConnect专线接入
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteDirectConnectResponse deleteDirectConnect(DeleteDirectConnectRequest request) throws OpenAPIException;


    /**
     * DeleteSegment - 删除外网线路
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSegmentResponse deleteSegment(DeleteSegmentRequest request) throws OpenAPIException;


    /**
     * DeleteSegmentRoute - 删除外网线路路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSegmentRouteResponse deleteSegmentRoute(DeleteSegmentRouteRequest request) throws OpenAPIException;


    /**
     * DescribeDirectConnect - 查询DirectConnect专线接入
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeDirectConnectResponse describeDirectConnect(DescribeDirectConnectRequest request) throws OpenAPIException;


    /**
     * DescribeSegment - 查询线路
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSegmentResponse describeSegment(DescribeSegmentRequest request) throws OpenAPIException;


    /**
     * DescribeSegmentRoute - 查询外网线路路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSegmentRouteResponse describeSegmentRoute(DescribeSegmentRouteRequest request) throws OpenAPIException;


    /**
     * UpdateDirectConnectBandwidth - 修改DirectConnect专线接入限速
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDirectConnectBandwidthResponse updateDirectConnectBandwidth(UpdateDirectConnectBandwidthRequest request) throws OpenAPIException;


    /**
     * UpdateDirectConnectRemoteSubnetCIDRs - 修改DirectConnect专线接入远端子网网段
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateDirectConnectRemoteSubnetCIDRsResponse updateDirectConnectRemoteSubnetCIDRs(UpdateDirectConnectRemoteSubnetCIDRsRequest request) throws OpenAPIException;


    /**
     * UpdateSegment - 更新外网线路
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateSegmentResponse updateSegment(UpdateSegmentRequest request) throws OpenAPIException;


    /**
     * UpdateSegmentRoute - 更新外网线路路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateSegmentRouteResponse updateSegmentRoute(UpdateSegmentRouteRequest request) throws OpenAPIException;


    /**
     * AliasSet - 设置计算集群别名
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AliasSetResponse aliasSet(AliasSetRequest request) throws OpenAPIException;


    /**
     * AliasStorageSet - 设置存储集群别名
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AliasStorageSetResponse aliasStorageSet(AliasStorageSetRequest request) throws OpenAPIException;


    /**
     * DescribeResourceUsers - 查询正在使用资源的用户
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeResourceUsersResponse describeResourceUsers(DescribeResourceUsersRequest request) throws OpenAPIException;


    /**
     * DescribeStorageSet - 查询存储集群信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeStorageSetResponse describeStorageSet(DescribeStorageSetRequest request) throws OpenAPIException;


    /**
     * DescribeStorageSetSortPolicy - 获取存储集群排序策略
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeStorageSetSortPolicyResponse describeStorageSetSortPolicy(DescribeStorageSetSortPolicyRequest request) throws OpenAPIException;


    /**
     * DescribeStorageType - 查询存储类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeStorageTypeResponse describeStorageType(DescribeStorageTypeRequest request) throws OpenAPIException;


    /**
     * DescribeVMSet - 获取虚拟机Set信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMSetResponse describeVMSet(DescribeVMSetRequest request) throws OpenAPIException;


    /**
     * DescribeVMType - 查询主机机型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMTypeResponse describeVMType(DescribeVMTypeRequest request) throws OpenAPIException;


    /**
     * UpdateComputeSetCPUAllocationRatio - 设置计算集群的超分比例
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateComputeSetCPUAllocationRatioResponse updateComputeSetCPUAllocationRatio(UpdateComputeSetCPUAllocationRatioRequest request) throws OpenAPIException;


    /**
     * UpdateComputeSetCPUModels - 设置计算CPU模型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateComputeSetCPUModelsResponse updateComputeSetCPUModels(UpdateComputeSetCPUModelsRequest request) throws OpenAPIException;


    /**
     * UpdateResourcePermission - 修改资源权限
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateResourcePermissionResponse updateResourcePermission(UpdateResourcePermissionRequest request) throws OpenAPIException;


    /**
     * UpdateStorageSetSortPolicy - 修改存储集群排序策略
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateStorageSetSortPolicyResponse updateStorageSetSortPolicy(UpdateStorageSetSortPolicyRequest request) throws OpenAPIException;


    /**
     * UpdateVMSetBoundImage - 更新计算集群绑定的镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMSetBoundImageResponse updateVMSetBoundImage(UpdateVMSetBoundImageRequest request) throws OpenAPIException;


    /**
     * UpdateVMSetBoundStorageSet - 更新计算集群绑定的存储集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMSetBoundStorageSetResponse updateVMSetBoundStorageSet(UpdateVMSetBoundStorageSetRequest request) throws OpenAPIException;


    /**
     * BindSecurityGroup - 绑定安全组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindSecurityGroupResponse bindSecurityGroup(BindSecurityGroupRequest request) throws OpenAPIException;


    /**
     * CreateIPGroup - 创建IP组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateIPGroupResponse createIPGroup(CreateIPGroupRequest request) throws OpenAPIException;


    /**
     * CreatePortGroup - 创建端口组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreatePortGroupResponse createPortGroup(CreatePortGroupRequest request) throws OpenAPIException;


    /**
     * CreateSecurityGroup - 创建安全组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws OpenAPIException;


    /**
     * CreateSecurityGroupRule - 新建安全组规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) throws OpenAPIException;


    /**
     * DeleteIPGroup - 删除IP组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteIPGroupResponse deleteIPGroup(DeleteIPGroupRequest request) throws OpenAPIException;


    /**
     * DeletePortGroup - 删除端口组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeletePortGroupResponse deletePortGroup(DeletePortGroupRequest request) throws OpenAPIException;


    /**
     * DeleteSecurityGroup - 删除安全组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws OpenAPIException;


    /**
     * DeleteSecurityGroupRule - 删除安全组规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) throws OpenAPIException;


    /**
     * DescribeIPGroup - 查询IP组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeIPGroupResponse describeIPGroup(DescribeIPGroupRequest request) throws OpenAPIException;


    /**
     * DescribePortGroup - 查询端口组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribePortGroupResponse describePortGroup(DescribePortGroupRequest request) throws OpenAPIException;


    /**
     * DescribeSecurityGroup - 获取安全组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSecurityGroupResponse describeSecurityGroup(DescribeSecurityGroupRequest request) throws OpenAPIException;


    /**
     * DescribeSecurityGroupResource - 获取安全组关联资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSecurityGroupResourceResponse describeSecurityGroupResource(DescribeSecurityGroupResourceRequest request) throws OpenAPIException;


    /**
     * DescribeSecurityGroupRule - 获取安全组规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSecurityGroupRuleResponse describeSecurityGroupRule(DescribeSecurityGroupRuleRequest request) throws OpenAPIException;


    /**
     * UnBindSecurityGroup - 解绑安全组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnBindSecurityGroupResponse unBindSecurityGroup(UnBindSecurityGroupRequest request) throws OpenAPIException;


    /**
     * UpdateIPGroup - 更新IP组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateIPGroupResponse updateIPGroup(UpdateIPGroupRequest request) throws OpenAPIException;


    /**
     * UpdatePortGroup - 更新端口组
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdatePortGroupResponse updatePortGroup(UpdatePortGroupRequest request) throws OpenAPIException;


    /**
     * UpdateSecurityGroupRule - 更新安全组规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateSecurityGroupRuleResponse updateSecurityGroupRule(UpdateSecurityGroupRuleRequest request) throws OpenAPIException;


    /**
     * AllocateExternalStorageSetDisk - 分配外置存储集群硬盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateExternalStorageSetDiskResponse allocateExternalStorageSetDisk(AllocateExternalStorageSetDiskRequest request) throws OpenAPIException;


    /**
     * AttachExternalDisk - 绑定外置存储
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachExternalDiskResponse attachExternalDisk(AttachExternalDiskRequest request) throws OpenAPIException;


    /**
     * CreateExternalStorageSet - 创建外置存储集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateExternalStorageSetResponse createExternalStorageSet(CreateExternalStorageSetRequest request) throws OpenAPIException;


    /**
     * DeleteExternalStorageSet - 删除外置存储集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteExternalStorageSetResponse deleteExternalStorageSet(DeleteExternalStorageSetRequest request) throws OpenAPIException;


    /**
     * DescribeExternalDisk - 查询外置存储集群硬盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeExternalDiskResponse describeExternalDisk(DescribeExternalDiskRequest request) throws OpenAPIException;


    /**
     * DescribeExternalStorageSet - 查询外置存储集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeExternalStorageSetResponse describeExternalStorageSet(DescribeExternalStorageSetRequest request) throws OpenAPIException;


    /**
     * DescribeExternalStorageType - 查询外置存储集群类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeExternalStorageTypeResponse describeExternalStorageType(DescribeExternalStorageTypeRequest request) throws OpenAPIException;


    /**
     * DetachExternalDisk - 解绑外置存储
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetachExternalDiskResponse detachExternalDisk(DetachExternalDiskRequest request) throws OpenAPIException;


    /**
     * ScanFCSAN - 扫描 FCSAN 外置存储集群硬盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ScanFCSANResponse scanFCSAN(ScanFCSANRequest request) throws OpenAPIException;


    /**
     * ScanISCSIDisk - 扫描外置存储集群硬盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ScanISCSIDiskResponse scanISCSIDisk(ScanISCSIDiskRequest request) throws OpenAPIException;


    /**
     * SetShareAbleExternalStorage - 外置存储盘设置为可共享的磁盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetShareAbleExternalStorageResponse setShareAbleExternalStorage(SetShareAbleExternalStorageRequest request) throws OpenAPIException;


    /**
     * UpdateExternalStorageSet - 更新外置存储集群
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateExternalStorageSetResponse updateExternalStorageSet(UpdateExternalStorageSetRequest request) throws OpenAPIException;


    /**
     * CompleteSMC - 完成迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CompleteSMCResponse completeSMC(CompleteSMCRequest request) throws OpenAPIException;


    /**
     * CreateSMC - 创建SMC任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSMCResponse createSMC(CreateSMCRequest request) throws OpenAPIException;


    /**
     * DeleteSMC - 删除SMC任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSMCResponse deleteSMC(DeleteSMCRequest request) throws OpenAPIException;


    /**
     * DescribeSMC - 获取SMC信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSMCResponse describeSMC(DescribeSMCRequest request) throws OpenAPIException;


    /**
     * SMCHeartbeat - smc心跳
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SMCHeartbeatResponse sMCHeartbeat(SMCHeartbeatRequest request) throws OpenAPIException;


    /**
     * SetupSMC - 设置SMC任务
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetupSMCResponse setupSMC(SetupSMCRequest request) throws OpenAPIException;


    /**
     * StartSMC - 开始迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public StartSMCResponse startSMC(StartSMCRequest request) throws OpenAPIException;


    /**
     * StopSMC - 停止迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public StopSMCResponse stopSMC(StopSMCRequest request) throws OpenAPIException;


    /**
     * BindTag - 绑定标签
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindTagResponse bindTag(BindTagRequest request) throws OpenAPIException;


    /**
     * CreateTag - 创建标签
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateTagResponse createTag(CreateTagRequest request) throws OpenAPIException;


    /**
     * DeleteTag - 删除标签
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws OpenAPIException;


    /**
     * DescribeBindableTagResource - 查询可绑定标签的资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeBindableTagResourceResponse describeBindableTagResource(DescribeBindableTagResourceRequest request) throws OpenAPIException;


    /**
     * DescribeTag - 查询标签
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTagResponse describeTag(DescribeTagRequest request) throws OpenAPIException;


    /**
     * DescribeTagResource - 查询标签资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTagResourceResponse describeTagResource(DescribeTagResourceRequest request) throws OpenAPIException;


    /**
     * SetResourceTags - 设置资源最终绑定的所有标签
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetResourceTagsResponse setResourceTags(SetResourceTagsRequest request) throws OpenAPIException;


    /**
     * UnBindTag - 标签解绑
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnBindTagResponse unBindTag(UnBindTagRequest request) throws OpenAPIException;


    /**
     * CreateTimer - 创建定时器
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateTimerResponse createTimer(CreateTimerRequest request) throws OpenAPIException;


    /**
     * DeleteTimer - 删除定时器
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteTimerResponse deleteTimer(DeleteTimerRequest request) throws OpenAPIException;


    /**
     * DescribeTimer - 查询定时器
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTimerResponse describeTimer(DescribeTimerRequest request) throws OpenAPIException;


    /**
     * DescribeTimerTask - 查询定时器执行记录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTimerTaskResponse describeTimerTask(DescribeTimerTaskRequest request) throws OpenAPIException;


    /**
     * UpdateTimer - 更新定时器
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateTimerResponse updateTimer(UpdateTimerRequest request) throws OpenAPIException;


    /**
     * CreateTrafficMirror - 创建流量镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateTrafficMirrorResponse createTrafficMirror(CreateTrafficMirrorRequest request) throws OpenAPIException;


    /**
     * DeleteTrafficMirror - 删除流量镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteTrafficMirrorResponse deleteTrafficMirror(DeleteTrafficMirrorRequest request) throws OpenAPIException;


    /**
     * DescribeTrafficMirror - 查询流量镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTrafficMirrorResponse describeTrafficMirror(DescribeTrafficMirrorRequest request) throws OpenAPIException;


    /**
     * DescribeTrafficMirrorSources - 查询流量镜像源设备信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeTrafficMirrorSourcesResponse describeTrafficMirrorSources(DescribeTrafficMirrorSourcesRequest request) throws OpenAPIException;


    /**
     * UpdateTrafficMirror - 更新流量镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateTrafficMirrorResponse updateTrafficMirror(UpdateTrafficMirrorRequest request) throws OpenAPIException;


    /**
     * UpdateTrafficMirrorEnable - 是否启用流量镜像
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateTrafficMirrorEnableResponse updateTrafficMirrorEnable(UpdateTrafficMirrorEnableRequest request) throws OpenAPIException;


    /**
     * UpdateTrafficMirrorRule - 更新流量镜像规则
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateTrafficMirrorRuleResponse updateTrafficMirrorRule(UpdateTrafficMirrorRuleRequest request) throws OpenAPIException;


    /**
     * UpdateTrafficMirrorSources - 更新流量镜像源设备信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateTrafficMirrorSourcesResponse updateTrafficMirrorSources(UpdateTrafficMirrorSourcesRequest request) throws OpenAPIException;


    /**
     * AllocateUSB - 分配USB设备
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateUSBResponse allocateUSB(AllocateUSBRequest request) throws OpenAPIException;


    /**
     * AttachUSB - 加载USB设备
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AttachUSBResponse attachUSB(AttachUSBRequest request) throws OpenAPIException;


    /**
     * DetachUSB - 卸载USB设备
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DetachUSBResponse detachUSB(DetachUSBRequest request) throws OpenAPIException;


    /**
     * ListUSBs - 获取USB设备信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListUSBsResponse listUSBs(ListUSBsRequest request) throws OpenAPIException;


    /**
     * AllocateVIP - 申请VIP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateVIPResponse allocateVIP(AllocateVIPRequest request) throws OpenAPIException;


    /**
     * DescribeVIP - 获取VIP列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVIPResponse describeVIP(DescribeVIPRequest request) throws OpenAPIException;


    /**
     * GetVIPDiffPrice - 获取外网VIP差价
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVIPDiffPriceResponse getVIPDiffPrice(GetVIPDiffPriceRequest request) throws OpenAPIException;


    /**
     * GetVIPPrice - 获取外网VIP价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVIPPriceResponse getVIPPrice(GetVIPPriceRequest request) throws OpenAPIException;


    /**
     * ReleaseVIP - 释放VIP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ReleaseVIPResponse releaseVIP(ReleaseVIPRequest request) throws OpenAPIException;


    /**
     * UpdateVIPBandwidth - 修改外网VIP的带宽
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVIPBandwidthResponse updateVIPBandwidth(UpdateVIPBandwidthRequest request) throws OpenAPIException;


    /**
     * UpdateVIPBindResource - 更新VIP绑定资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVIPBindResourceResponse updateVIPBindResource(UpdateVIPBindResourceRequest request) throws OpenAPIException;


    /**
     * AbortMigrateVMDisk - 取消虚拟机热存储迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AbortMigrateVMDiskResponse abortMigrateVMDisk(AbortMigrateVMDiskRequest request) throws OpenAPIException;


    /**
     * AbortVMSnapshot - 取消虚拟机整机快照
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AbortVMSnapshotResponse abortVMSnapshot(AbortVMSnapshotRequest request) throws OpenAPIException;


    /**
     * AddVMDisk - 添加虚拟机磁盘
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AddVMDiskResponse addVMDisk(AddVMDiskRequest request) throws OpenAPIException;


    /**
     * AddVMNIC - 添加虚拟机网卡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AddVMNICResponse addVMNIC(AddVMNICRequest request) throws OpenAPIException;


    /**
     * AllocateVMSSHSession - 申请虚拟机SSH会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateVMSSHSessionResponse allocateVMSSHSession(AllocateVMSSHSessionRequest request) throws OpenAPIException;


    /**
     * AllocateVMVNCSession - 申请VNC会话
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AllocateVMVNCSessionResponse allocateVMVNCSession(AllocateVMVNCSessionRequest request) throws OpenAPIException;


    /**
     * CancelCloneVMInstance - 取消整机克隆
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CancelCloneVMInstanceResponse cancelCloneVMInstance(CancelCloneVMInstanceRequest request) throws OpenAPIException;


    /**
     * CloneVMInstance - 整机克隆
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CloneVMInstanceResponse cloneVMInstance(CloneVMInstanceRequest request) throws OpenAPIException;


    /**
     * CreateVMInstance - 创建虚拟机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateVMInstanceResponse createVMInstance(CreateVMInstanceRequest request) throws OpenAPIException;


    /**
     * DeleteVMC - 删除 VMC 资源
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVMCResponse deleteVMC(DeleteVMCRequest request) throws OpenAPIException;


    /**
     * DeleteVMInstance - 删除虚拟机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVMInstanceResponse deleteVMInstance(DeleteVMInstanceRequest request) throws OpenAPIException;


    /**
     * DeleteVMNIC - 删除虚拟机网卡
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVMNICResponse deleteVMNIC(DeleteVMNICRequest request) throws OpenAPIException;


    /**
     * DeleteVMSnapshot - 虚拟机删除快照
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVMSnapshotResponse deleteVMSnapshot(DeleteVMSnapshotRequest request) throws OpenAPIException;


    /**
     * DescribeCIStatus - 查询CI状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeCIStatusResponse describeCIStatus(DescribeCIStatusRequest request) throws OpenAPIException;


    /**
     * DescribeVMC - 获取 VMC 资源信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMCResponse describeVMC(DescribeVMCRequest request) throws OpenAPIException;


    /**
     * DescribeVMInstance - 获取虚拟机信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMInstanceResponse describeVMInstance(DescribeVMInstanceRequest request) throws OpenAPIException;


    /**
     * DescribeVMWareVMs - 获取 vmware 虚拟机信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVMWareVMsResponse describeVMWareVMs(DescribeVMWareVMsRequest request) throws OpenAPIException;


    /**
     * GenerateVMWareConsoleTicket - 创建 vmware 虚拟机控制台凭证
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GenerateVMWareConsoleTicketResponse generateVMWareConsoleTicket(GenerateVMWareConsoleTicketRequest request) throws OpenAPIException;


    /**
     * GetPaymentOfPremium - 获取修改配置后的差价
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetPaymentOfPremiumResponse getPaymentOfPremium(GetPaymentOfPremiumRequest request) throws OpenAPIException;


    /**
     * GetVMInstancePrice - 获取虚拟机价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVMInstancePriceResponse getVMInstancePrice(GetVMInstancePriceRequest request) throws OpenAPIException;


    /**
     * GetVMScreenshot - 获取截屏
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVMScreenshotResponse getVMScreenshot(GetVMScreenshotRequest request) throws OpenAPIException;


    /**
     * GetVMSpiceInfo - 获取Spice信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVMSpiceInfoResponse getVMSpiceInfo(GetVMSpiceInfoRequest request) throws OpenAPIException;


    /**
     * GetVMVNCInfo - 获取VNC信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVMVNCInfoResponse getVMVNCInfo(GetVMVNCInfoRequest request) throws OpenAPIException;


    /**
     * GetVMWareClusterDatastore - 获取 vmware 计算集群的信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVMWareClusterDatastoreResponse getVMWareClusterDatastore(GetVMWareClusterDatastoreRequest request) throws OpenAPIException;


    /**
     * MigrateMgrVMStorage - 虚拟机热存储迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public MigrateMgrVMStorageResponse migrateMgrVMStorage(MigrateMgrVMStorageRequest request) throws OpenAPIException;


    /**
     * MigrateStorageBandWidth - 虚拟机热存储迁移带宽设置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public MigrateStorageBandWidthResponse migrateStorageBandWidth(MigrateStorageBandWidthRequest request) throws OpenAPIException;


    /**
     * MigrateVMStorage - 虚拟机热存储迁移
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public MigrateVMStorageResponse migrateVMStorage(MigrateVMStorageRequest request) throws OpenAPIException;


    /**
     * PoweroffVMInstance - 断电主机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public PoweroffVMInstanceResponse poweroffVMInstance(PoweroffVMInstanceRequest request) throws OpenAPIException;


    /**
     * ReinstallVMInstance - 重装系统
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ReinstallVMInstanceResponse reinstallVMInstance(ReinstallVMInstanceRequest request) throws OpenAPIException;


    /**
     * ResetVMInstancePassword - 重置主机密码
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ResetVMInstancePasswordResponse resetVMInstancePassword(ResetVMInstancePasswordRequest request) throws OpenAPIException;


    /**
     * ResetVMNetConfig - 虚拟机网络参数重置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ResetVMNetConfigResponse resetVMNetConfig(ResetVMNetConfigRequest request) throws OpenAPIException;


    /**
     * ResizeVMConfig - 修改虚拟机配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ResizeVMConfigResponse resizeVMConfig(ResizeVMConfigRequest request) throws OpenAPIException;


    /**
     * RestartVMInstance - 重启主机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RestartVMInstanceResponse restartVMInstance(RestartVMInstanceRequest request) throws OpenAPIException;


    /**
     * RestoreVMInstance - 虚拟机恢复快照
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public RestoreVMInstanceResponse restoreVMInstance(RestoreVMInstanceRequest request) throws OpenAPIException;


    /**
     * SaveVMInstance - 虚拟机整机快照
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SaveVMInstanceResponse saveVMInstance(SaveVMInstanceRequest request) throws OpenAPIException;


    /**
     * SetBootFromCdrom - 设置虚拟机从Cdrom启动
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public SetBootFromCdromResponse setBootFromCdrom(SetBootFromCdromRequest request) throws OpenAPIException;


    /**
     * StartVMInstance - 启动主机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public StartVMInstanceResponse startVMInstance(StartVMInstanceRequest request) throws OpenAPIException;


    /**
     * StopVMInstance - 关闭主机
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public StopVMInstanceResponse stopVMInstance(StopVMInstanceRequest request) throws OpenAPIException;


    /**
     * UnSetBootFromCdrom - 设置虚拟机不从Cdrom启动
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnSetBootFromCdromResponse unSetBootFromCdrom(UnSetBootFromCdromRequest request) throws OpenAPIException;


    /**
     * UpdateVMAdvancedOptions - 设置虚拟机高级参数(DNS)
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMAdvancedOptionsResponse updateVMAdvancedOptions(UpdateVMAdvancedOptionsRequest request) throws OpenAPIException;


    /**
     * UpdateVMBootBootLoaderType - 设置虚拟机引导方式
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMBootBootLoaderTypeResponse updateVMBootBootLoaderType(UpdateVMBootBootLoaderTypeRequest request) throws OpenAPIException;


    /**
     * UpdateVMBootDevices - 设置虚拟机引导顺序
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMBootDevicesResponse updateVMBootDevices(UpdateVMBootDevicesRequest request) throws OpenAPIException;


    /**
     * UpdateVMCPUHypervisor - 设置虚拟机CPU虚拟化隐藏标记
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMCPUHypervisorResponse updateVMCPUHypervisor(UpdateVMCPUHypervisorRequest request) throws OpenAPIException;


    /**
     * UpdateVMCPULimitPercent - 修改虚拟机CPU资源限制
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMCPULimitPercentResponse updateVMCPULimitPercent(UpdateVMCPULimitPercentRequest request) throws OpenAPIException;


    /**
     * UpdateVMCPUModel - 设置虚拟机cpu模型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMCPUModelResponse updateVMCPUModel(UpdateVMCPUModelRequest request) throws OpenAPIException;


    /**
     * UpdateVMCPUPriority - 修改虚拟机CPU资源优先级
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMCPUPriorityResponse updateVMCPUPriority(UpdateVMCPUPriorityRequest request) throws OpenAPIException;


    /**
     * UpdateVMDNS - 设置虚拟机DNS
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMDNSResponse updateVMDNS(UpdateVMDNSRequest request) throws OpenAPIException;


    /**
     * UpdateVMDefaultGW - 设置虚拟机出口
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMDefaultGWResponse updateVMDefaultGW(UpdateVMDefaultGWRequest request) throws OpenAPIException;


    /**
     * UpdateVMDiskBus - 更新磁盘总线类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMDiskBusResponse updateVMDiskBus(UpdateVMDiskBusRequest request) throws OpenAPIException;


    /**
     * UpdateVMDiskCacheMode - 设置虚拟机磁盘缓存类型
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMDiskCacheModeResponse updateVMDiskCacheMode(UpdateVMDiskCacheModeRequest request) throws OpenAPIException;


    /**
     * UpdateVMHighAvailability - 设置虚拟机高可用
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMHighAvailabilityResponse updateVMHighAvailability(UpdateVMHighAvailabilityRequest request) throws OpenAPIException;


    /**
     * UpdateVMISOSlot - 设置虚拟机iso插槽数量
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMISOSlotResponse updateVMISOSlot(UpdateVMISOSlotRequest request) throws OpenAPIException;


    /**
     * UpdateVMMAC - 修改网卡的MAC
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMMACResponse updateVMMAC(UpdateVMMACRequest request) throws OpenAPIException;


    /**
     * UpdateVMNICLinkState - 更新虚拟机网卡启用状态
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMNICLinkStateResponse updateVMNICLinkState(UpdateVMNICLinkStateRequest request) throws OpenAPIException;


    /**
     * UpdateVMNICModel - 更新虚拟机网卡型号
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMNICModelResponse updateVMNICModel(UpdateVMNICModelRequest request) throws OpenAPIException;


    /**
     * UpdateVMNICQueues - 更新虚拟机网卡队列
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMNICQueuesResponse updateVMNICQueues(UpdateVMNICQueuesRequest request) throws OpenAPIException;


    /**
     * UpdateVMOS - 更新虚拟机操作系统
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMOSResponse updateVMOS(UpdateVMOSRequest request) throws OpenAPIException;


    /**
     * UpdateVMSupportHotPlug - 更新虚拟机热插拔
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMSupportHotPlugResponse updateVMSupportHotPlug(UpdateVMSupportHotPlugRequest request) throws OpenAPIException;


    /**
     * UpdateVMUserData - 设置虚拟机用户数据
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMUserDataResponse updateVMUserData(UpdateVMUserDataRequest request) throws OpenAPIException;


    /**
     * UpdateVMVCPUBinding - 虚拟机更新VCPU绑定
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVMVCPUBindingResponse updateVMVCPUBinding(UpdateVMVCPUBindingRequest request) throws OpenAPIException;


    /**
     * AssociateVPCPeering - 创建VPC对等连接
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public AssociateVPCPeeringResponse associateVPCPeering(AssociateVPCPeeringRequest request) throws OpenAPIException;


    /**
     * CreateSubnet - 创建子网
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) throws OpenAPIException;


    /**
     * CreateSubnetRoute - 创建子网路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateSubnetRouteResponse createSubnetRoute(CreateSubnetRouteRequest request) throws OpenAPIException;


    /**
     * CreateVPC - 创建VPC
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateVPCResponse createVPC(CreateVPCRequest request) throws OpenAPIException;


    /**
     * DeleteSubnet - 删除子网
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) throws OpenAPIException;


    /**
     * DeleteSubnetRoute - 删除子网路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteSubnetRouteResponse deleteSubnetRoute(DeleteSubnetRouteRequest request) throws OpenAPIException;


    /**
     * DeleteVPC - 删除VPC
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVPCResponse deleteVPC(DeleteVPCRequest request) throws OpenAPIException;


    /**
     * DescribeSubnet - 获取子网
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSubnetResponse describeSubnet(DescribeSubnetRequest request) throws OpenAPIException;


    /**
     * DescribeSubnetRoute - 查询子网路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeSubnetRouteResponse describeSubnetRoute(DescribeSubnetRouteRequest request) throws OpenAPIException;


    /**
     * DescribeVPC - 获取VPC信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVPCResponse describeVPC(DescribeVPCRequest request) throws OpenAPIException;


    /**
     * DissociateVPCPeering - 删除VPC对等连接
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DissociateVPCPeeringResponse dissociateVPCPeering(DissociateVPCPeeringRequest request) throws OpenAPIException;


    /**
     * GetSubnetAvailableIPQuota - 获取子网可用IP数量
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetSubnetAvailableIPQuotaResponse getSubnetAvailableIPQuota(GetSubnetAvailableIPQuotaRequest request) throws OpenAPIException;


    /**
     * ListAllocatedIPsInSubnet - 获取子网中申请出来的IP列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ListAllocatedIPsInSubnetResponse listAllocatedIPsInSubnet(ListAllocatedIPsInSubnetRequest request) throws OpenAPIException;


    /**
     * ReplaceIP - 更新产品内网IP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public ReplaceIPResponse replaceIP(ReplaceIPRequest request) throws OpenAPIException;


    /**
     * UpdateSubnetRoute - 更新子网路由
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateSubnetRouteResponse updateSubnetRoute(UpdateSubnetRouteRequest request) throws OpenAPIException;


    /**
     * BindEIPToVPN - 绑定EIP到VPN
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public BindEIPToVPNResponse bindEIPToVPN(BindEIPToVPNRequest request) throws OpenAPIException;


    /**
     * CreateRemoteVPNGW - 创建对端网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateRemoteVPNGWResponse createRemoteVPNGW(CreateRemoteVPNGWRequest request) throws OpenAPIException;


    /**
     * CreateVPNGW - 创建网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateVPNGWResponse createVPNGW(CreateVPNGWRequest request) throws OpenAPIException;


    /**
     * CreateVPNTunnel - 创建隧道
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateVPNTunnelResponse createVPNTunnel(CreateVPNTunnelRequest request) throws OpenAPIException;


    /**
     * DeleteRemoteVPNGW - 删除对端网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteRemoteVPNGWResponse deleteRemoteVPNGW(DeleteRemoteVPNGWRequest request) throws OpenAPIException;


    /**
     * DeleteVPNGW - 删除网关
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVPNGWResponse deleteVPNGW(DeleteVPNGWRequest request) throws OpenAPIException;


    /**
     * DeleteVPNTunnel - 删除隧道
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteVPNTunnelResponse deleteVPNTunnel(DeleteVPNTunnelRequest request) throws OpenAPIException;


    /**
     * DescribeRemoteVPNGW - 获取对端网关信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeRemoteVPNGWResponse describeRemoteVPNGW(DescribeRemoteVPNGWRequest request) throws OpenAPIException;


    /**
     * DescribeVPNGW - 获取网关信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVPNGWResponse describeVPNGW(DescribeVPNGWRequest request) throws OpenAPIException;


    /**
     * DescribeVPNTunnel - 获取隧道信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeVPNTunnelResponse describeVPNTunnel(DescribeVPNTunnelRequest request) throws OpenAPIException;


    /**
     * GetPrice - 获取价格
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetPriceResponse getPrice(GetPriceRequest request) throws OpenAPIException;


    /**
     * GetVPNTunnelConfig - 获取隧道配置
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public GetVPNTunnelConfigResponse getVPNTunnelConfig(GetVPNTunnelConfigRequest request) throws OpenAPIException;


    /**
     * UnbindEIPFromVPN - 从VPN解绑EIP
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UnbindEIPFromVPNResponse unbindEIPFromVPN(UnbindEIPFromVPNRequest request) throws OpenAPIException;


    /**
     * UpdateVPNTunnel - 更新隧道信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateVPNTunnelResponse updateVPNTunnel(UpdateVPNTunnelRequest request) throws OpenAPIException;


    /**
     * UpgradeVPNGWToHA - 升级为高可用版本
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpgradeVPNGWToHAResponse upgradeVPNGWToHA(UpgradeVPNGWToHARequest request) throws OpenAPIException;


    /**
     * CreateWorkflow - 创建自定义流程
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) throws OpenAPIException;


    /**
     * DeleteWorkflow - 删除自定义流程
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) throws OpenAPIException;


    /**
     * DescribeApplication - 查询审批记录
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeApplicationResponse describeApplication(DescribeApplicationRequest request) throws OpenAPIException;


    /**
     * DescribeApplicationNode - 查询审批列表
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeApplicationNodeResponse describeApplicationNode(DescribeApplicationNodeRequest request) throws OpenAPIException;


    /**
     * DescribeWorkflow - 查询自定义流程
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public DescribeWorkflowResponse describeWorkflow(DescribeWorkflowRequest request) throws OpenAPIException;


    /**
     * UpdateApplicationNode - 更新审批节点信息
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateApplicationNodeResponse updateApplicationNode(UpdateApplicationNodeRequest request) throws OpenAPIException;


    /**
     * UpdateWorkflow - 更新自定义流程
     *
     * @param request Request object
     * @throws OpenAPIException Exception
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) throws OpenAPIException;

}
