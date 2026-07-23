/**
 * Copyright 2021 OpenAPI Technology Co., Ltd.
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
package cn.openapi.client;

import cn.openapi.common.client.Client;
import cn.openapi.common.exception.OpenAPIException;
import cn.openapi.apis.BindAlertTemplateRequest;
import cn.openapi.apis.BindAlertTemplateResponse;
import cn.openapi.apis.CreateAlertNotifyGroupRequest;
import cn.openapi.apis.CreateAlertNotifyGroupResponse;
import cn.openapi.apis.CreateAlertNotifyReceiverRequest;
import cn.openapi.apis.CreateAlertNotifyReceiverResponse;
import cn.openapi.apis.CreateAlertNotifyWebhookRequest;
import cn.openapi.apis.CreateAlertNotifyWebhookResponse;
import cn.openapi.apis.CreateAlertTemplateRequest;
import cn.openapi.apis.CreateAlertTemplateResponse;
import cn.openapi.apis.CreateAlertTemplateRuleRequest;
import cn.openapi.apis.CreateAlertTemplateRuleResponse;
import cn.openapi.apis.CreateOPLogNotifyRuleRequest;
import cn.openapi.apis.CreateOPLogNotifyRuleResponse;
import cn.openapi.apis.CreateResourceEventNotifyRuleRequest;
import cn.openapi.apis.CreateResourceEventNotifyRuleResponse;
import cn.openapi.apis.DeleteAlertNotifyGroupRequest;
import cn.openapi.apis.DeleteAlertNotifyGroupResponse;
import cn.openapi.apis.DeleteAlertNotifyReceiverRequest;
import cn.openapi.apis.DeleteAlertNotifyReceiverResponse;
import cn.openapi.apis.DeleteAlertNotifyWebhookRequest;
import cn.openapi.apis.DeleteAlertNotifyWebhookResponse;
import cn.openapi.apis.DeleteAlertTemplateRequest;
import cn.openapi.apis.DeleteAlertTemplateResponse;
import cn.openapi.apis.DeleteAlertTemplateRuleRequest;
import cn.openapi.apis.DeleteAlertTemplateRuleResponse;
import cn.openapi.apis.DeleteOPLogNotifyRuleRequest;
import cn.openapi.apis.DeleteOPLogNotifyRuleResponse;
import cn.openapi.apis.DeleteResourceEventNotifyRuleRequest;
import cn.openapi.apis.DeleteResourceEventNotifyRuleResponse;
import cn.openapi.apis.DescribeAlertRequest;
import cn.openapi.apis.DescribeAlertResponse;
import cn.openapi.apis.DescribeAlertNotifyGroupRequest;
import cn.openapi.apis.DescribeAlertNotifyGroupResponse;
import cn.openapi.apis.DescribeAlertNotifyReceiverRequest;
import cn.openapi.apis.DescribeAlertNotifyReceiverResponse;
import cn.openapi.apis.DescribeAlertNotifyWebhookRequest;
import cn.openapi.apis.DescribeAlertNotifyWebhookResponse;
import cn.openapi.apis.DescribeAlertTemplateRequest;
import cn.openapi.apis.DescribeAlertTemplateResponse;
import cn.openapi.apis.DescribeAlertTemplateRuleRequest;
import cn.openapi.apis.DescribeAlertTemplateRuleResponse;
import cn.openapi.apis.DescribeAlertTemplateTargetRequest;
import cn.openapi.apis.DescribeAlertTemplateTargetResponse;
import cn.openapi.apis.DescribeMetricRequest;
import cn.openapi.apis.DescribeMetricResponse;
import cn.openapi.apis.DescribeOPLogNotifyRuleRequest;
import cn.openapi.apis.DescribeOPLogNotifyRuleResponse;
import cn.openapi.apis.DescribeResourceEventNotifyRuleRequest;
import cn.openapi.apis.DescribeResourceEventNotifyRuleResponse;
import cn.openapi.apis.OperateAlertRequest;
import cn.openapi.apis.OperateAlertResponse;
import cn.openapi.apis.PrometheusQueryRequest;
import cn.openapi.apis.PrometheusQueryResponse;
import cn.openapi.apis.PrometheusQueryRangeRequest;
import cn.openapi.apis.PrometheusQueryRangeResponse;
import cn.openapi.apis.UnbindAlertTemplateRequest;
import cn.openapi.apis.UnbindAlertTemplateResponse;
import cn.openapi.apis.UpdateAlertNotifyGroupRequest;
import cn.openapi.apis.UpdateAlertNotifyGroupResponse;
import cn.openapi.apis.UpdateAlertNotifyReceiverRequest;
import cn.openapi.apis.UpdateAlertNotifyReceiverResponse;
import cn.openapi.apis.UpdateAlertNotifyWebhookRequest;
import cn.openapi.apis.UpdateAlertNotifyWebhookResponse;
import cn.openapi.apis.UpdateAlertTemplateRequest;
import cn.openapi.apis.UpdateAlertTemplateResponse;
import cn.openapi.apis.UpdateAlertTemplateRuleRequest;
import cn.openapi.apis.UpdateAlertTemplateRuleResponse;
import cn.openapi.apis.UpdateOPLogNotifyRuleRequest;
import cn.openapi.apis.UpdateOPLogNotifyRuleResponse;
import cn.openapi.apis.UpdateResourceEventNotifyRuleRequest;
import cn.openapi.apis.UpdateResourceEventNotifyRuleResponse;
import cn.openapi.apis.AddASMemberRequest;
import cn.openapi.apis.AddASMemberResponse;
import cn.openapi.apis.AttachLoadBalancerRequest;
import cn.openapi.apis.AttachLoadBalancerResponse;
import cn.openapi.apis.CreateASGroupRequest;
import cn.openapi.apis.CreateASGroupResponse;
import cn.openapi.apis.DeleteASGroupRequest;
import cn.openapi.apis.DeleteASGroupResponse;
import cn.openapi.apis.DescribeASGroupRequest;
import cn.openapi.apis.DescribeASGroupResponse;
import cn.openapi.apis.DetachLoadBalancerRequest;
import cn.openapi.apis.DetachLoadBalancerResponse;
import cn.openapi.apis.DisableASGroupRequest;
import cn.openapi.apis.DisableASGroupResponse;
import cn.openapi.apis.EnableASGroupRequest;
import cn.openapi.apis.EnableASGroupResponse;
import cn.openapi.apis.RemoveASMemberRequest;
import cn.openapi.apis.RemoveASMemberResponse;
import cn.openapi.apis.UpdateASGroupRequest;
import cn.openapi.apis.UpdateASGroupResponse;
import cn.openapi.apis.DescribeBillDetailRequest;
import cn.openapi.apis.DescribeBillDetailResponse;
import cn.openapi.apis.DescribeBillOverViewRequest;
import cn.openapi.apis.DescribeBillOverViewResponse;
import cn.openapi.apis.DescribeBillResourceRequest;
import cn.openapi.apis.DescribeBillResourceResponse;
import cn.openapi.apis.DescribeOrderRequest;
import cn.openapi.apis.DescribeOrderResponse;
import cn.openapi.apis.DescribePriceRequest;
import cn.openapi.apis.DescribePriceResponse;
import cn.openapi.apis.DescribeRechargeRequest;
import cn.openapi.apis.DescribeRechargeResponse;
import cn.openapi.apis.DescribeTransactionRequest;
import cn.openapi.apis.DescribeTransactionResponse;
import cn.openapi.apis.DescribeWithdrawRequest;
import cn.openapi.apis.DescribeWithdrawResponse;
import cn.openapi.apis.GetRenewPriceRequest;
import cn.openapi.apis.GetRenewPriceResponse;
import cn.openapi.apis.GetWithdrawableAmountRequest;
import cn.openapi.apis.GetWithdrawableAmountResponse;
import cn.openapi.apis.RechargeRequest;
import cn.openapi.apis.RechargeResponse;
import cn.openapi.apis.RenewResourceRequest;
import cn.openapi.apis.RenewResourceResponse;
import cn.openapi.apis.UpdateDiscountRequest;
import cn.openapi.apis.UpdateDiscountResponse;
import cn.openapi.apis.UpdatePriceRequest;
import cn.openapi.apis.UpdatePriceResponse;
import cn.openapi.apis.WithdrawRequest;
import cn.openapi.apis.WithdrawResponse;
import cn.openapi.apis.CreateBucketRequest;
import cn.openapi.apis.CreateBucketResponse;
import cn.openapi.apis.CreateBucketLifecycleRuleRequest;
import cn.openapi.apis.CreateBucketLifecycleRuleResponse;
import cn.openapi.apis.CreateDOSTokenRequest;
import cn.openapi.apis.CreateDOSTokenResponse;
import cn.openapi.apis.DOSLoginRequest;
import cn.openapi.apis.DOSLoginResponse;
import cn.openapi.apis.DeleteBucketRequest;
import cn.openapi.apis.DeleteBucketResponse;
import cn.openapi.apis.DeleteBucketLifecycleRuleRequest;
import cn.openapi.apis.DeleteBucketLifecycleRuleResponse;
import cn.openapi.apis.DeleteDOSTokenRequest;
import cn.openapi.apis.DeleteDOSTokenResponse;
import cn.openapi.apis.DescribeBucketLifecycleRulesRequest;
import cn.openapi.apis.DescribeBucketLifecycleRulesResponse;
import cn.openapi.apis.DescribeBucketsRequest;
import cn.openapi.apis.DescribeBucketsResponse;
import cn.openapi.apis.DescribeDOSTokenRequest;
import cn.openapi.apis.DescribeDOSTokenResponse;
import cn.openapi.apis.FlushBucketRequest;
import cn.openapi.apis.FlushBucketResponse;
import cn.openapi.apis.UpdateBucketAccessTypeRequest;
import cn.openapi.apis.UpdateBucketAccessTypeResponse;
import cn.openapi.apis.UpdateBucketEventLoggingRequest;
import cn.openapi.apis.UpdateBucketEventLoggingResponse;
import cn.openapi.apis.UpdateBucketLifecycleRuleRequest;
import cn.openapi.apis.UpdateBucketLifecycleRuleResponse;
import cn.openapi.apis.UpdateBucketObjectLockRequest;
import cn.openapi.apis.UpdateBucketObjectLockResponse;
import cn.openapi.apis.UpdateBucketQuotaRequest;
import cn.openapi.apis.UpdateBucketQuotaResponse;
import cn.openapi.apis.UpdateBucketVersioningRequest;
import cn.openapi.apis.UpdateBucketVersioningResponse;
import cn.openapi.apis.UpdateDOSTokenRequest;
import cn.openapi.apis.UpdateDOSTokenResponse;
import cn.openapi.apis.CreateUserRequest;
import cn.openapi.apis.CreateUserResponse;
import cn.openapi.apis.DeleteCompanyRequest;
import cn.openapi.apis.DeleteCompanyResponse;
import cn.openapi.apis.DescribeLoginWhitelistRequest;
import cn.openapi.apis.DescribeLoginWhitelistResponse;
import cn.openapi.apis.DescribeTenantResourcesRequest;
import cn.openapi.apis.DescribeTenantResourcesResponse;
import cn.openapi.apis.DescribeUserRequest;
import cn.openapi.apis.DescribeUserResponse;
import cn.openapi.apis.FreezeUserRequest;
import cn.openapi.apis.FreezeUserResponse;
import cn.openapi.apis.RenameCompanyRequest;
import cn.openapi.apis.RenameCompanyResponse;
import cn.openapi.apis.UnFreezeUserRequest;
import cn.openapi.apis.UnFreezeUserResponse;
import cn.openapi.apis.UpdateCompanyEmailRequest;
import cn.openapi.apis.UpdateCompanyEmailResponse;
import cn.openapi.apis.UpdateCompanyNameRequest;
import cn.openapi.apis.UpdateCompanyNameResponse;
import cn.openapi.apis.UpdateLoginWhitelistRequest;
import cn.openapi.apis.UpdateLoginWhitelistResponse;
import cn.openapi.apis.CreateProductSpecificationRequest;
import cn.openapi.apis.CreateProductSpecificationResponse;
import cn.openapi.apis.DeleteProductSpecificationRequest;
import cn.openapi.apis.DeleteProductSpecificationResponse;
import cn.openapi.apis.DescribeProductSpecificationRequest;
import cn.openapi.apis.DescribeProductSpecificationResponse;
import cn.openapi.apis.DescribeProductSpecificationTemplateRequest;
import cn.openapi.apis.DescribeProductSpecificationTemplateResponse;
import cn.openapi.apis.DescribeQuotaRequest;
import cn.openapi.apis.DescribeQuotaResponse;
import cn.openapi.apis.DescribeQuotaUsageRequest;
import cn.openapi.apis.DescribeQuotaUsageResponse;
import cn.openapi.apis.DescribeResourceInfoRequest;
import cn.openapi.apis.DescribeResourceInfoResponse;
import cn.openapi.apis.DescribeSetAllocateUsageRequest;
import cn.openapi.apis.DescribeSetAllocateUsageResponse;
import cn.openapi.apis.GetConfigRequest;
import cn.openapi.apis.GetConfigResponse;
import cn.openapi.apis.GetFilterKeywordsRequest;
import cn.openapi.apis.GetFilterKeywordsResponse;
import cn.openapi.apis.GetRegionConfigRequest;
import cn.openapi.apis.GetRegionConfigResponse;
import cn.openapi.apis.GetSSOConfigRequest;
import cn.openapi.apis.GetSSOConfigResponse;
import cn.openapi.apis.ListGlobalConfigsRequest;
import cn.openapi.apis.ListGlobalConfigsResponse;
import cn.openapi.apis.ListRegionConfigSyncStatusRequest;
import cn.openapi.apis.ListRegionConfigSyncStatusResponse;
import cn.openapi.apis.ListRegionConfigsRequest;
import cn.openapi.apis.ListRegionConfigsResponse;
import cn.openapi.apis.SetAccountQuotaRequest;
import cn.openapi.apis.SetAccountQuotaResponse;
import cn.openapi.apis.UpdateConfigRequest;
import cn.openapi.apis.UpdateConfigResponse;
import cn.openapi.apis.UpdateProductSpecificationRequest;
import cn.openapi.apis.UpdateProductSpecificationResponse;
import cn.openapi.apis.UpdateRegionConfigRequest;
import cn.openapi.apis.UpdateRegionConfigResponse;
import cn.openapi.apis.VerifyEmailAvailabilityRequest;
import cn.openapi.apis.VerifyEmailAvailabilityResponse;
import cn.openapi.apis.CreateContainerImageRepositoryRequest;
import cn.openapi.apis.CreateContainerImageRepositoryResponse;
import cn.openapi.apis.DeleteContainerImageRequest;
import cn.openapi.apis.DeleteContainerImageResponse;
import cn.openapi.apis.DeleteContainerImageRepositoryRequest;
import cn.openapi.apis.DeleteContainerImageRepositoryResponse;
import cn.openapi.apis.DeleteContainerImageTagRequest;
import cn.openapi.apis.DeleteContainerImageTagResponse;
import cn.openapi.apis.DescribeContainerImageRequest;
import cn.openapi.apis.DescribeContainerImageResponse;
import cn.openapi.apis.DescribeContainerImageRepositoryRequest;
import cn.openapi.apis.DescribeContainerImageRepositoryResponse;
import cn.openapi.apis.DescribeContainerImageTagRequest;
import cn.openapi.apis.DescribeContainerImageTagResponse;
import cn.openapi.apis.UpdateContainerImageRepositoryRequest;
import cn.openapi.apis.UpdateContainerImageRepositoryResponse;
import cn.openapi.apis.BindStorageToDBSRequest;
import cn.openapi.apis.BindStorageToDBSResponse;
import cn.openapi.apis.ChangeDBSGatewayEIPRequest;
import cn.openapi.apis.ChangeDBSGatewayEIPResponse;
import cn.openapi.apis.CreateDBSBackupPlanRequest;
import cn.openapi.apis.CreateDBSBackupPlanResponse;
import cn.openapi.apis.CreateDBSGatewayRequest;
import cn.openapi.apis.CreateDBSGatewayResponse;
import cn.openapi.apis.DeleteDBSBackupRequest;
import cn.openapi.apis.DeleteDBSBackupResponse;
import cn.openapi.apis.DeleteDBSBackupPlanRequest;
import cn.openapi.apis.DeleteDBSBackupPlanResponse;
import cn.openapi.apis.DeleteDBSGatewayRequest;
import cn.openapi.apis.DeleteDBSGatewayResponse;
import cn.openapi.apis.DescribeDBSBackupRequest;
import cn.openapi.apis.DescribeDBSBackupResponse;
import cn.openapi.apis.DescribeDBSBackupPlanRequest;
import cn.openapi.apis.DescribeDBSBackupPlanResponse;
import cn.openapi.apis.DescribeDBSGatewayRequest;
import cn.openapi.apis.DescribeDBSGatewayResponse;
import cn.openapi.apis.DescribeDBSRestoreRangeInfoRequest;
import cn.openapi.apis.DescribeDBSRestoreRangeInfoResponse;
import cn.openapi.apis.DescribeDBSStorageRequest;
import cn.openapi.apis.DescribeDBSStorageResponse;
import cn.openapi.apis.ExecDBSBackupPlanRequest;
import cn.openapi.apis.ExecDBSBackupPlanResponse;
import cn.openapi.apis.PauseDBSBackupRequest;
import cn.openapi.apis.PauseDBSBackupResponse;
import cn.openapi.apis.ResumeDBSBackupRequest;
import cn.openapi.apis.ResumeDBSBackupResponse;
import cn.openapi.apis.UnbindStorageFromDBSRequest;
import cn.openapi.apis.UnbindStorageFromDBSResponse;
import cn.openapi.apis.UpdateDBSBackupPlanRequest;
import cn.openapi.apis.UpdateDBSBackupPlanResponse;
import cn.openapi.apis.UpdateDBSBackupPlanSimpleRequest;
import cn.openapi.apis.UpdateDBSBackupPlanSimpleResponse;
import cn.openapi.apis.UpdateDBSStorageRequest;
import cn.openapi.apis.UpdateDBSStorageResponse;
import cn.openapi.apis.AttachDiskRequest;
import cn.openapi.apis.AttachDiskResponse;
import cn.openapi.apis.AttachISORequest;
import cn.openapi.apis.AttachISOResponse;
import cn.openapi.apis.CloneDiskRequest;
import cn.openapi.apis.CloneDiskResponse;
import cn.openapi.apis.CreateDiskRequest;
import cn.openapi.apis.CreateDiskResponse;
import cn.openapi.apis.CreateDiskFromSnapshotRequest;
import cn.openapi.apis.CreateDiskFromSnapshotResponse;
import cn.openapi.apis.DeleteDiskRequest;
import cn.openapi.apis.DeleteDiskResponse;
import cn.openapi.apis.DescribeDiskRequest;
import cn.openapi.apis.DescribeDiskResponse;
import cn.openapi.apis.DescribeVMISORequest;
import cn.openapi.apis.DescribeVMISOResponse;
import cn.openapi.apis.DetachDiskRequest;
import cn.openapi.apis.DetachDiskResponse;
import cn.openapi.apis.DetachISORequest;
import cn.openapi.apis.DetachISOResponse;
import cn.openapi.apis.GetCreateDiskPriceRequest;
import cn.openapi.apis.GetCreateDiskPriceResponse;
import cn.openapi.apis.GetDiskPriceRequest;
import cn.openapi.apis.GetDiskPriceResponse;
import cn.openapi.apis.GetUpgradeDiskPriceRequest;
import cn.openapi.apis.GetUpgradeDiskPriceResponse;
import cn.openapi.apis.UpdateDiskQoSRequest;
import cn.openapi.apis.UpdateDiskQoSResponse;
import cn.openapi.apis.UpgradeDiskRequest;
import cn.openapi.apis.UpgradeDiskResponse;
import cn.openapi.apis.CreateSnapshotRequest;
import cn.openapi.apis.CreateSnapshotResponse;
import cn.openapi.apis.DeleteSnapshotRequest;
import cn.openapi.apis.DeleteSnapshotResponse;
import cn.openapi.apis.DescribeSnapshotRequest;
import cn.openapi.apis.DescribeSnapshotResponse;
import cn.openapi.apis.RollbackSnapshotRequest;
import cn.openapi.apis.RollbackSnapshotResponse;
import cn.openapi.apis.DeleteComputeClassDRSRequest;
import cn.openapi.apis.DeleteComputeClassDRSResponse;
import cn.openapi.apis.DescribeComputeClassDRSRequest;
import cn.openapi.apis.DescribeComputeClassDRSResponse;
import cn.openapi.apis.DescribeComputeClassDRSRecordsRequest;
import cn.openapi.apis.DescribeComputeClassDRSRecordsResponse;
import cn.openapi.apis.DescribeComputeClassDRSScoreRequest;
import cn.openapi.apis.DescribeComputeClassDRSScoreResponse;
import cn.openapi.apis.DescribeComputeClassDRSSuggestionsRequest;
import cn.openapi.apis.DescribeComputeClassDRSSuggestionsResponse;
import cn.openapi.apis.DescribeComputeClassVMsAddToDRSRuleRequest;
import cn.openapi.apis.DescribeComputeClassVMsAddToDRSRuleResponse;
import cn.openapi.apis.SetComputeClassDRSRequest;
import cn.openapi.apis.SetComputeClassDRSResponse;
import cn.openapi.apis.SetComputeClassDRSSuspendRequest;
import cn.openapi.apis.SetComputeClassDRSSuspendResponse;
import cn.openapi.apis.SetComputeClassDRSVMRuleRequest;
import cn.openapi.apis.SetComputeClassDRSVMRuleResponse;
import cn.openapi.apis.TriggerDRSOnceRequest;
import cn.openapi.apis.TriggerDRSOnceResponse;
import cn.openapi.apis.CreateDTSTaskRequest;
import cn.openapi.apis.CreateDTSTaskResponse;
import cn.openapi.apis.CreateDataCheckTaskRequest;
import cn.openapi.apis.CreateDataCheckTaskResponse;
import cn.openapi.apis.DeleteDTSTaskRequest;
import cn.openapi.apis.DeleteDTSTaskResponse;
import cn.openapi.apis.DescribeDTSLogRequest;
import cn.openapi.apis.DescribeDTSLogResponse;
import cn.openapi.apis.DescribeDTSTaskRequest;
import cn.openapi.apis.DescribeDTSTaskResponse;
import cn.openapi.apis.DescribeDataCheckTaskRequest;
import cn.openapi.apis.DescribeDataCheckTaskResponse;
import cn.openapi.apis.GetDTSPriceRequest;
import cn.openapi.apis.GetDTSPriceResponse;
import cn.openapi.apis.GetDTSTaskConfigureRequest;
import cn.openapi.apis.GetDTSTaskConfigureResponse;
import cn.openapi.apis.GetDataCheckTaskResultRequest;
import cn.openapi.apis.GetDataCheckTaskResultResponse;
import cn.openapi.apis.RunDTSPrecheckRequest;
import cn.openapi.apis.RunDTSPrecheckResponse;
import cn.openapi.apis.StartDTSTaskRequest;
import cn.openapi.apis.StartDTSTaskResponse;
import cn.openapi.apis.SuspendDTSTaskRequest;
import cn.openapi.apis.SuspendDTSTaskResponse;
import cn.openapi.apis.UpdateDTSInstanceSpecRequest;
import cn.openapi.apis.UpdateDTSInstanceSpecResponse;
import cn.openapi.apis.UpdateDTSTaskConfigureRequest;
import cn.openapi.apis.UpdateDTSTaskConfigureResponse;
import cn.openapi.apis.CreateFlatNetworkRequest;
import cn.openapi.apis.CreateFlatNetworkResponse;
import cn.openapi.apis.CreateFlatNetworkRouteRequest;
import cn.openapi.apis.CreateFlatNetworkRouteResponse;
import cn.openapi.apis.DeleteFlatNetworkRequest;
import cn.openapi.apis.DeleteFlatNetworkResponse;
import cn.openapi.apis.DeleteFlatNetworkRouteRequest;
import cn.openapi.apis.DeleteFlatNetworkRouteResponse;
import cn.openapi.apis.DescribeFlatNetworkRequest;
import cn.openapi.apis.DescribeFlatNetworkResponse;
import cn.openapi.apis.DescribeFlatNetworkRouteRequest;
import cn.openapi.apis.DescribeFlatNetworkRouteResponse;
import cn.openapi.apis.UpdateFlatNetworkRequest;
import cn.openapi.apis.UpdateFlatNetworkResponse;
import cn.openapi.apis.UpdateFlatNetworkRouteRequest;
import cn.openapi.apis.UpdateFlatNetworkRouteResponse;
import cn.openapi.apis.CreateFSRequest;
import cn.openapi.apis.CreateFSResponse;
import cn.openapi.apis.CreateFSDirRequest;
import cn.openapi.apis.CreateFSDirResponse;
import cn.openapi.apis.DeleteFSRequest;
import cn.openapi.apis.DeleteFSResponse;
import cn.openapi.apis.DeleteFSFileRequest;
import cn.openapi.apis.DeleteFSFileResponse;
import cn.openapi.apis.DescribeFSRequest;
import cn.openapi.apis.DescribeFSResponse;
import cn.openapi.apis.DescribeFSFileRequest;
import cn.openapi.apis.DescribeFSFileResponse;
import cn.openapi.apis.FSLoginRequest;
import cn.openapi.apis.FSLoginResponse;
import cn.openapi.apis.GetFSPriceRequest;
import cn.openapi.apis.GetFSPriceResponse;
import cn.openapi.apis.UpgradeFSRequest;
import cn.openapi.apis.UpgradeFSResponse;
import cn.openapi.apis.AbortMigrateVMInstanceRequest;
import cn.openapi.apis.AbortMigrateVMInstanceResponse;
import cn.openapi.apis.CloseHostNUMAScheduleRequest;
import cn.openapi.apis.CloseHostNUMAScheduleResponse;
import cn.openapi.apis.DescribeHostPodsRequest;
import cn.openapi.apis.DescribeHostPodsResponse;
import cn.openapi.apis.DescribeHostVMInstanceRequest;
import cn.openapi.apis.DescribeHostVMInstanceResponse;
import cn.openapi.apis.DescribeNodeRequest;
import cn.openapi.apis.DescribeNodeResponse;
import cn.openapi.apis.DescribeNodeNUMAInfoRequest;
import cn.openapi.apis.DescribeNodeNUMAInfoResponse;
import cn.openapi.apis.DescribeVMHostRequest;
import cn.openapi.apis.DescribeVMHostResponse;
import cn.openapi.apis.DiskLightOffRequest;
import cn.openapi.apis.DiskLightOffResponse;
import cn.openapi.apis.DiskLightOnRequest;
import cn.openapi.apis.DiskLightOnResponse;
import cn.openapi.apis.GetNodeCPUGovernorRequest;
import cn.openapi.apis.GetNodeCPUGovernorResponse;
import cn.openapi.apis.ListGPUsRequest;
import cn.openapi.apis.ListGPUsResponse;
import cn.openapi.apis.LockHostRequest;
import cn.openapi.apis.LockHostResponse;
import cn.openapi.apis.MigrateVMInstanceRequest;
import cn.openapi.apis.MigrateVMInstanceResponse;
import cn.openapi.apis.OpenHostNUMAScheduleRequest;
import cn.openapi.apis.OpenHostNUMAScheduleResponse;
import cn.openapi.apis.UnlockHostRequest;
import cn.openapi.apis.UnlockHostResponse;
import cn.openapi.apis.UpdateNodeCPUGovernorRequest;
import cn.openapi.apis.UpdateNodeCPUGovernorResponse;
import cn.openapi.apis.UpdateVFLogicCountRequest;
import cn.openapi.apis.UpdateVFLogicCountResponse;
import cn.openapi.apis.AllocateNodeHostDeviceRequest;
import cn.openapi.apis.AllocateNodeHostDeviceResponse;
import cn.openapi.apis.CreateNodeHostDeviceRequest;
import cn.openapi.apis.CreateNodeHostDeviceResponse;
import cn.openapi.apis.DeleteNodeHostDeviceRequest;
import cn.openapi.apis.DeleteNodeHostDeviceResponse;
import cn.openapi.apis.DescribeNodeHostDeviceRequest;
import cn.openapi.apis.DescribeNodeHostDeviceResponse;
import cn.openapi.apis.AbortCustomImageRequest;
import cn.openapi.apis.AbortCustomImageResponse;
import cn.openapi.apis.AbortImageMultipartUploadRequest;
import cn.openapi.apis.AbortImageMultipartUploadResponse;
import cn.openapi.apis.CloneCustomImageToBaseImageRequest;
import cn.openapi.apis.CloneCustomImageToBaseImageResponse;
import cn.openapi.apis.CompleteImageMultipartUploadRequest;
import cn.openapi.apis.CompleteImageMultipartUploadResponse;
import cn.openapi.apis.CreateCustomImageRequest;
import cn.openapi.apis.CreateCustomImageResponse;
import cn.openapi.apis.DeleteBaseImageRequest;
import cn.openapi.apis.DeleteBaseImageResponse;
import cn.openapi.apis.DeleteCustomImageRequest;
import cn.openapi.apis.DeleteCustomImageResponse;
import cn.openapi.apis.DescribeBaseImageRequest;
import cn.openapi.apis.DescribeBaseImageResponse;
import cn.openapi.apis.DescribeImageRequest;
import cn.openapi.apis.DescribeImageResponse;
import cn.openapi.apis.DescribeImageOSVersionsRequest;
import cn.openapi.apis.DescribeImageOSVersionsResponse;
import cn.openapi.apis.GetImageDownloadURLRequest;
import cn.openapi.apis.GetImageDownloadURLResponse;
import cn.openapi.apis.ImportImageRequest;
import cn.openapi.apis.ImportImageResponse;
import cn.openapi.apis.UpdateImageRequest;
import cn.openapi.apis.UpdateImageResponse;
import cn.openapi.apis.CountTenantResourceByStatusRequest;
import cn.openapi.apis.CountTenantResourceByStatusResponse;
import cn.openapi.apis.CreateOnSiteInspectionRequest;
import cn.openapi.apis.CreateOnSiteInspectionResponse;
import cn.openapi.apis.CreateResourceUsageRequest;
import cn.openapi.apis.CreateResourceUsageResponse;
import cn.openapi.apis.DeleteOnSiteInspectionRequest;
import cn.openapi.apis.DeleteOnSiteInspectionResponse;
import cn.openapi.apis.DeleteResourceUsageRequest;
import cn.openapi.apis.DeleteResourceUsageResponse;
import cn.openapi.apis.DescribeNetworkTopologyRequest;
import cn.openapi.apis.DescribeNetworkTopologyResponse;
import cn.openapi.apis.DescribeResourceChartRequest;
import cn.openapi.apis.DescribeResourceChartResponse;
import cn.openapi.apis.DescribeResourceConditionRequest;
import cn.openapi.apis.DescribeResourceConditionResponse;
import cn.openapi.apis.DescribeResourceEventRequest;
import cn.openapi.apis.DescribeResourceEventResponse;
import cn.openapi.apis.GetOnSiteInspectionRequest;
import cn.openapi.apis.GetOnSiteInspectionResponse;
import cn.openapi.apis.GetResourceUsageRequest;
import cn.openapi.apis.GetResourceUsageResponse;
import cn.openapi.apis.ListExpiredResourcesRequest;
import cn.openapi.apis.ListExpiredResourcesResponse;
import cn.openapi.apis.ListOnSiteInspectionsRequest;
import cn.openapi.apis.ListOnSiteInspectionsResponse;
import cn.openapi.apis.ListResourceUsagesRequest;
import cn.openapi.apis.ListResourceUsagesResponse;
import cn.openapi.apis.RetryResourceUsageRequest;
import cn.openapi.apis.RetryResourceUsageResponse;
import cn.openapi.apis.AllocateEIPRequest;
import cn.openapi.apis.AllocateEIPResponse;
import cn.openapi.apis.BindEIPRequest;
import cn.openapi.apis.BindEIPResponse;
import cn.openapi.apis.CheckIPInuseRequest;
import cn.openapi.apis.CheckIPInuseResponse;
import cn.openapi.apis.DescribeEIPRequest;
import cn.openapi.apis.DescribeEIPResponse;
import cn.openapi.apis.GetEIPDiffPriceRequest;
import cn.openapi.apis.GetEIPDiffPriceResponse;
import cn.openapi.apis.GetEIPPriceRequest;
import cn.openapi.apis.GetEIPPriceResponse;
import cn.openapi.apis.ModifyEIPBandwidthRequest;
import cn.openapi.apis.ModifyEIPBandwidthResponse;
import cn.openapi.apis.ReleaseEIPRequest;
import cn.openapi.apis.ReleaseEIPResponse;
import cn.openapi.apis.UnBindEIPRequest;
import cn.openapi.apis.UnBindEIPResponse;
import cn.openapi.apis.AddNodesToIsolationGroupRequest;
import cn.openapi.apis.AddNodesToIsolationGroupResponse;
import cn.openapi.apis.AddVMToIsolationGroupRequest;
import cn.openapi.apis.AddVMToIsolationGroupResponse;
import cn.openapi.apis.CreateIsolationGroupRequest;
import cn.openapi.apis.CreateIsolationGroupResponse;
import cn.openapi.apis.DeleteIsolationGroupRequest;
import cn.openapi.apis.DeleteIsolationGroupResponse;
import cn.openapi.apis.DescribeIsolationGroupsRequest;
import cn.openapi.apis.DescribeIsolationGroupsResponse;
import cn.openapi.apis.DescribeVMAddToVMGroupRequest;
import cn.openapi.apis.DescribeVMAddToVMGroupResponse;
import cn.openapi.apis.RemoveNodesFromIsolationGroupRequest;
import cn.openapi.apis.RemoveNodesFromIsolationGroupResponse;
import cn.openapi.apis.RemoveVMFromIsolationGroupRequest;
import cn.openapi.apis.RemoveVMFromIsolationGroupResponse;
import cn.openapi.apis.UpdateIsolationGroupRequest;
import cn.openapi.apis.UpdateIsolationGroupResponse;
import cn.openapi.apis.AllocateK8SSessionRequest;
import cn.openapi.apis.AllocateK8SSessionResponse;
import cn.openapi.apis.AllocateK8STerminalRequest;
import cn.openapi.apis.AllocateK8STerminalResponse;
import cn.openapi.apis.AllocateNativeNodeSSHSessionRequest;
import cn.openapi.apis.AllocateNativeNodeSSHSessionResponse;
import cn.openapi.apis.AllocateNativeNodeVNCSessionRequest;
import cn.openapi.apis.AllocateNativeNodeVNCSessionResponse;
import cn.openapi.apis.AttachClusterEIPRequest;
import cn.openapi.apis.AttachClusterEIPResponse;
import cn.openapi.apis.CreateClusterRequest;
import cn.openapi.apis.CreateClusterResponse;
import cn.openapi.apis.CreateNativeNodeRequest;
import cn.openapi.apis.CreateNativeNodeResponse;
import cn.openapi.apis.DeleteClusterRequest;
import cn.openapi.apis.DeleteClusterResponse;
import cn.openapi.apis.DeleteNativeNodeRequest;
import cn.openapi.apis.DeleteNativeNodeResponse;
import cn.openapi.apis.DescribeClusterRequest;
import cn.openapi.apis.DescribeClusterResponse;
import cn.openapi.apis.DescribeNativeNodeRequest;
import cn.openapi.apis.DescribeNativeNodeResponse;
import cn.openapi.apis.DetachClusterEIPRequest;
import cn.openapi.apis.DetachClusterEIPResponse;
import cn.openapi.apis.ForwardClusterRequest;
import cn.openapi.apis.ForwardClusterResponse;
import cn.openapi.apis.GetClusterPaymentOfPremiumRequest;
import cn.openapi.apis.GetClusterPaymentOfPremiumResponse;
import cn.openapi.apis.GetClusterPriceRequest;
import cn.openapi.apis.GetClusterPriceResponse;
import cn.openapi.apis.GetContainerLogsRequest;
import cn.openapi.apis.GetContainerLogsResponse;
import cn.openapi.apis.GetNativeNodePriceRequest;
import cn.openapi.apis.GetNativeNodePriceResponse;
import cn.openapi.apis.UpdateClusterRequest;
import cn.openapi.apis.UpdateClusterResponse;
import cn.openapi.apis.UpdateClusterCapacityRequest;
import cn.openapi.apis.UpdateClusterCapacityResponse;
import cn.openapi.apis.UpdateNativeNodeInstanceStatusRequest;
import cn.openapi.apis.UpdateNativeNodeInstanceStatusResponse;
import cn.openapi.apis.UpdateNativeNodeWANRequest;
import cn.openapi.apis.UpdateNativeNodeWANResponse;
import cn.openapi.apis.BindEIPToLBRequest;
import cn.openapi.apis.BindEIPToLBResponse;
import cn.openapi.apis.CreateCertificateRequest;
import cn.openapi.apis.CreateCertificateResponse;
import cn.openapi.apis.CreateLBRequest;
import cn.openapi.apis.CreateLBResponse;
import cn.openapi.apis.CreateRSRequest;
import cn.openapi.apis.CreateRSResponse;
import cn.openapi.apis.CreateVSRequest;
import cn.openapi.apis.CreateVSResponse;
import cn.openapi.apis.CreateVSPolicyRequest;
import cn.openapi.apis.CreateVSPolicyResponse;
import cn.openapi.apis.DeleteCertificateRequest;
import cn.openapi.apis.DeleteCertificateResponse;
import cn.openapi.apis.DeleteLBRequest;
import cn.openapi.apis.DeleteLBResponse;
import cn.openapi.apis.DeleteRSRequest;
import cn.openapi.apis.DeleteRSResponse;
import cn.openapi.apis.DeleteVSRequest;
import cn.openapi.apis.DeleteVSResponse;
import cn.openapi.apis.DeleteVSPolicyRequest;
import cn.openapi.apis.DeleteVSPolicyResponse;
import cn.openapi.apis.DescribeCertificateRequest;
import cn.openapi.apis.DescribeCertificateResponse;
import cn.openapi.apis.DescribeLBRequest;
import cn.openapi.apis.DescribeLBResponse;
import cn.openapi.apis.DescribeRSRequest;
import cn.openapi.apis.DescribeRSResponse;
import cn.openapi.apis.DescribeVSRequest;
import cn.openapi.apis.DescribeVSResponse;
import cn.openapi.apis.DescribeVSPolicyRequest;
import cn.openapi.apis.DescribeVSPolicyResponse;
import cn.openapi.apis.DisableRSRequest;
import cn.openapi.apis.DisableRSResponse;
import cn.openapi.apis.DowngradeLBRequest;
import cn.openapi.apis.DowngradeLBResponse;
import cn.openapi.apis.EnableRSRequest;
import cn.openapi.apis.EnableRSResponse;
import cn.openapi.apis.GetLBPriceRequest;
import cn.openapi.apis.GetLBPriceResponse;
import cn.openapi.apis.UnbindEIPFromLBRequest;
import cn.openapi.apis.UnbindEIPFromLBResponse;
import cn.openapi.apis.UpdateLBAccessLogForLiveRequest;
import cn.openapi.apis.UpdateLBAccessLogForLiveResponse;
import cn.openapi.apis.UpdateLBLogRequest;
import cn.openapi.apis.UpdateLBLogResponse;
import cn.openapi.apis.UpdateRSRequest;
import cn.openapi.apis.UpdateRSResponse;
import cn.openapi.apis.UpdateSGFromLBRequest;
import cn.openapi.apis.UpdateSGFromLBResponse;
import cn.openapi.apis.UpdateVSRequest;
import cn.openapi.apis.UpdateVSResponse;
import cn.openapi.apis.UpdateVSPolicyRequest;
import cn.openapi.apis.UpdateVSPolicyResponse;
import cn.openapi.apis.UpgradeLBRequest;
import cn.openapi.apis.UpgradeLBResponse;
import cn.openapi.apis.UpgradeLBToHARequest;
import cn.openapi.apis.UpgradeLBToHAResponse;
import cn.openapi.apis.DescribeOPLogsRequest;
import cn.openapi.apis.DescribeOPLogsResponse;
import cn.openapi.apis.ChangeMemberPasswordRequest;
import cn.openapi.apis.ChangeMemberPasswordResponse;
import cn.openapi.apis.CreateAdminRequest;
import cn.openapi.apis.CreateAdminResponse;
import cn.openapi.apis.CreateSubMemberRequest;
import cn.openapi.apis.CreateSubMemberResponse;
import cn.openapi.apis.DeleteAdminRequest;
import cn.openapi.apis.DeleteAdminResponse;
import cn.openapi.apis.DeleteMemberRequest;
import cn.openapi.apis.DeleteMemberResponse;
import cn.openapi.apis.DescribeMemberRequest;
import cn.openapi.apis.DescribeMemberResponse;
import cn.openapi.apis.DescribePermissionRequest;
import cn.openapi.apis.DescribePermissionResponse;
import cn.openapi.apis.FreezeSubMemberRequest;
import cn.openapi.apis.FreezeSubMemberResponse;
import cn.openapi.apis.GetMemberInfoRequest;
import cn.openapi.apis.GetMemberInfoResponse;
import cn.openapi.apis.ListAdminRequest;
import cn.openapi.apis.ListAdminResponse;
import cn.openapi.apis.LoginByPasswordRequest;
import cn.openapi.apis.LoginByPasswordResponse;
import cn.openapi.apis.LogoutTokenRequest;
import cn.openapi.apis.LogoutTokenResponse;
import cn.openapi.apis.UnFreezeSubMemberRequest;
import cn.openapi.apis.UnFreezeSubMemberResponse;
import cn.openapi.apis.UpdateDigitalCertRequest;
import cn.openapi.apis.UpdateDigitalCertResponse;
import cn.openapi.apis.UpdateMemberEmailRequest;
import cn.openapi.apis.UpdateMemberEmailResponse;
import cn.openapi.apis.UpdateMemberNameRequest;
import cn.openapi.apis.UpdateMemberNameResponse;
import cn.openapi.apis.UpdateMemberOAuth2UniqueIDRequest;
import cn.openapi.apis.UpdateMemberOAuth2UniqueIDResponse;
import cn.openapi.apis.UpdateMemberPhoneRequest;
import cn.openapi.apis.UpdateMemberPhoneResponse;
import cn.openapi.apis.CreateMulticastGroupRequest;
import cn.openapi.apis.CreateMulticastGroupResponse;
import cn.openapi.apis.DeleteMulticastGroupRequest;
import cn.openapi.apis.DeleteMulticastGroupResponse;
import cn.openapi.apis.DescribeMulticastGroupRequest;
import cn.openapi.apis.DescribeMulticastGroupResponse;
import cn.openapi.apis.UpdateMulticastGroupRequest;
import cn.openapi.apis.UpdateMulticastGroupResponse;
import cn.openapi.apis.ApplyMySQLParamTplRequest;
import cn.openapi.apis.ApplyMySQLParamTplResponse;
import cn.openapi.apis.CreateMySQLRequest;
import cn.openapi.apis.CreateMySQLResponse;
import cn.openapi.apis.CreateMySQLParamTplRequest;
import cn.openapi.apis.CreateMySQLParamTplResponse;
import cn.openapi.apis.CreateMySQLSlaveRequest;
import cn.openapi.apis.CreateMySQLSlaveResponse;
import cn.openapi.apis.DeleteMySQLRequest;
import cn.openapi.apis.DeleteMySQLResponse;
import cn.openapi.apis.DeleteMySQLParamTplRequest;
import cn.openapi.apis.DeleteMySQLParamTplResponse;
import cn.openapi.apis.DescribeMySQLRequest;
import cn.openapi.apis.DescribeMySQLResponse;
import cn.openapi.apis.DescribeMySQLConfigParamRequest;
import cn.openapi.apis.DescribeMySQLConfigParamResponse;
import cn.openapi.apis.DescribeMySQLErrorLogsRequest;
import cn.openapi.apis.DescribeMySQLErrorLogsResponse;
import cn.openapi.apis.DescribeMySQLParamTplRequest;
import cn.openapi.apis.DescribeMySQLParamTplResponse;
import cn.openapi.apis.DescribeMySQLParamTplsRequest;
import cn.openapi.apis.DescribeMySQLParamTplsResponse;
import cn.openapi.apis.DescribeMySQLSlowLogRecordsRequest;
import cn.openapi.apis.DescribeMySQLSlowLogRecordsResponse;
import cn.openapi.apis.DescribePMAURLRequest;
import cn.openapi.apis.DescribePMAURLResponse;
import cn.openapi.apis.DowngradeMySQLRequest;
import cn.openapi.apis.DowngradeMySQLResponse;
import cn.openapi.apis.GetMySQLPriceRequest;
import cn.openapi.apis.GetMySQLPriceResponse;
import cn.openapi.apis.ResetMySQLPasswordRequest;
import cn.openapi.apis.ResetMySQLPasswordResponse;
import cn.openapi.apis.RestartMySQLInstanceRequest;
import cn.openapi.apis.RestartMySQLInstanceResponse;
import cn.openapi.apis.UpdateMySQLConfigParamRequest;
import cn.openapi.apis.UpdateMySQLConfigParamResponse;
import cn.openapi.apis.UpdateMySQLParamTplRequest;
import cn.openapi.apis.UpdateMySQLParamTplResponse;
import cn.openapi.apis.UpgradeMySQLRequest;
import cn.openapi.apis.UpgradeMySQLResponse;
import cn.openapi.apis.UpgradeMySQLToHARequest;
import cn.openapi.apis.UpgradeMySQLToHAResponse;
import cn.openapi.apis.BindEIPToNATGWRequest;
import cn.openapi.apis.BindEIPToNATGWResponse;
import cn.openapi.apis.CreateNATGWRequest;
import cn.openapi.apis.CreateNATGWResponse;
import cn.openapi.apis.CreateNATGWPolicyRequest;
import cn.openapi.apis.CreateNATGWPolicyResponse;
import cn.openapi.apis.CreateNATGWRuleRequest;
import cn.openapi.apis.CreateNATGWRuleResponse;
import cn.openapi.apis.DeleteNATGWRequest;
import cn.openapi.apis.DeleteNATGWResponse;
import cn.openapi.apis.DeleteNATGWPolicyRequest;
import cn.openapi.apis.DeleteNATGWPolicyResponse;
import cn.openapi.apis.DeleteNATGWRuleRequest;
import cn.openapi.apis.DeleteNATGWRuleResponse;
import cn.openapi.apis.DescribeNATGWRequest;
import cn.openapi.apis.DescribeNATGWResponse;
import cn.openapi.apis.DescribeNATGWPolicyRequest;
import cn.openapi.apis.DescribeNATGWPolicyResponse;
import cn.openapi.apis.DescribeNATGWRuleRequest;
import cn.openapi.apis.DescribeNATGWRuleResponse;
import cn.openapi.apis.GetNATGWPriceRequest;
import cn.openapi.apis.GetNATGWPriceResponse;
import cn.openapi.apis.UnbindEIPFromNATGWRequest;
import cn.openapi.apis.UnbindEIPFromNATGWResponse;
import cn.openapi.apis.UpdateNATGWPolicyRequest;
import cn.openapi.apis.UpdateNATGWPolicyResponse;
import cn.openapi.apis.UpdateNATGWRuleRequest;
import cn.openapi.apis.UpdateNATGWRuleResponse;
import cn.openapi.apis.UpdateSGFromNATGWRequest;
import cn.openapi.apis.UpdateSGFromNATGWResponse;
import cn.openapi.apis.UpgradeNATGWToHARequest;
import cn.openapi.apis.UpgradeNATGWToHAResponse;
import cn.openapi.apis.AttachNICRequest;
import cn.openapi.apis.AttachNICResponse;
import cn.openapi.apis.CheckMACInUseRequest;
import cn.openapi.apis.CheckMACInUseResponse;
import cn.openapi.apis.CreateNICRequest;
import cn.openapi.apis.CreateNICResponse;
import cn.openapi.apis.DeleteNICRequest;
import cn.openapi.apis.DeleteNICResponse;
import cn.openapi.apis.DescribeNICRequest;
import cn.openapi.apis.DescribeNICResponse;
import cn.openapi.apis.DetachNICRequest;
import cn.openapi.apis.DetachNICResponse;
import cn.openapi.apis.GetCreateNICPriceRequest;
import cn.openapi.apis.GetCreateNICPriceResponse;
import cn.openapi.apis.GetUpdateNICPriceRequest;
import cn.openapi.apis.GetUpdateNICPriceResponse;
import cn.openapi.apis.UpdateNICIPRequest;
import cn.openapi.apis.UpdateNICIPResponse;
import cn.openapi.apis.UpdateNICIPBandwidthRequest;
import cn.openapi.apis.UpdateNICIPBandwidthResponse;
import cn.openapi.apis.UpdateNICMACRequest;
import cn.openapi.apis.UpdateNICMACResponse;
import cn.openapi.apis.UpdateNICPFRequest;
import cn.openapi.apis.UpdateNICPFResponse;
import cn.openapi.apis.UpdateNICTrafficShapingRequest;
import cn.openapi.apis.UpdateNICTrafficShapingResponse;
import cn.openapi.apis.AbortMigratePaaSInstanceRequest;
import cn.openapi.apis.AbortMigratePaaSInstanceResponse;
import cn.openapi.apis.DescribeAuditLogRequest;
import cn.openapi.apis.DescribeAuditLogResponse;
import cn.openapi.apis.DescribePaaSInstanceRequest;
import cn.openapi.apis.DescribePaaSInstanceResponse;
import cn.openapi.apis.DescribeParametersHistoriesRequest;
import cn.openapi.apis.DescribeParametersHistoriesResponse;
import cn.openapi.apis.GetConnectionInfoRequest;
import cn.openapi.apis.GetConnectionInfoResponse;
import cn.openapi.apis.GetMigratePaaSInstancePriceRequest;
import cn.openapi.apis.GetMigratePaaSInstancePriceResponse;
import cn.openapi.apis.GetMigratePaaSStoragePriceRequest;
import cn.openapi.apis.GetMigratePaaSStoragePriceResponse;
import cn.openapi.apis.MigratePaaSInstanceRequest;
import cn.openapi.apis.MigratePaaSInstanceResponse;
import cn.openapi.apis.MigratePaaSStorageRequest;
import cn.openapi.apis.MigratePaaSStorageResponse;
import cn.openapi.apis.RecoverPaaSConfigRequest;
import cn.openapi.apis.RecoverPaaSConfigResponse;
import cn.openapi.apis.StartPaaSInstanceRequest;
import cn.openapi.apis.StartPaaSInstanceResponse;
import cn.openapi.apis.StopPaaSInstanceRequest;
import cn.openapi.apis.StopPaaSInstanceResponse;
import cn.openapi.apis.UpdateAuditLogRequest;
import cn.openapi.apis.UpdateAuditLogResponse;
import cn.openapi.apis.UpdatePaaSDiskQoSRequest;
import cn.openapi.apis.UpdatePaaSDiskQoSResponse;
import cn.openapi.apis.UpdateTerminationPolicyRequest;
import cn.openapi.apis.UpdateTerminationPolicyResponse;
import cn.openapi.apis.CreateOrchTaskRequest;
import cn.openapi.apis.CreateOrchTaskResponse;
import cn.openapi.apis.DeleteOrchTaskRequest;
import cn.openapi.apis.DeleteOrchTaskResponse;
import cn.openapi.apis.DescribeOrchTaskRequest;
import cn.openapi.apis.DescribeOrchTaskResponse;
import cn.openapi.apis.DescribeOrchTaskTypeRequest;
import cn.openapi.apis.DescribeOrchTaskTypeResponse;
import cn.openapi.apis.OperateOrchTaskRequest;
import cn.openapi.apis.OperateOrchTaskResponse;
import cn.openapi.apis.UpdateOrchTaskRequest;
import cn.openapi.apis.UpdateOrchTaskResponse;
import cn.openapi.apis.CreateOSSRequest;
import cn.openapi.apis.CreateOSSResponse;
import cn.openapi.apis.DeleteOSSRequest;
import cn.openapi.apis.DeleteOSSResponse;
import cn.openapi.apis.DescribeOSSRequest;
import cn.openapi.apis.DescribeOSSResponse;
import cn.openapi.apis.DowngradeOSSRequest;
import cn.openapi.apis.DowngradeOSSResponse;
import cn.openapi.apis.GetOSSPriceRequest;
import cn.openapi.apis.GetOSSPriceResponse;
import cn.openapi.apis.ResetOSSPasswordRequest;
import cn.openapi.apis.ResetOSSPasswordResponse;
import cn.openapi.apis.UpgradeOSSRequest;
import cn.openapi.apis.UpgradeOSSResponse;
import cn.openapi.apis.AttachPlatformStorageDiskRequest;
import cn.openapi.apis.AttachPlatformStorageDiskResponse;
import cn.openapi.apis.CreatePlatformStorageDiskRequest;
import cn.openapi.apis.CreatePlatformStorageDiskResponse;
import cn.openapi.apis.DeletePlatformStorageDiskRequest;
import cn.openapi.apis.DeletePlatformStorageDiskResponse;
import cn.openapi.apis.DescribePlatformStorageRequest;
import cn.openapi.apis.DescribePlatformStorageResponse;
import cn.openapi.apis.DescribePlatformStorageDiskRequest;
import cn.openapi.apis.DescribePlatformStorageDiskResponse;
import cn.openapi.apis.ResizePlatformStorageDiskRequest;
import cn.openapi.apis.ResizePlatformStorageDiskResponse;
import cn.openapi.apis.AllocatePMRequest;
import cn.openapi.apis.AllocatePMResponse;
import cn.openapi.apis.AllocatePMVNCSessionRequest;
import cn.openapi.apis.AllocatePMVNCSessionResponse;
import cn.openapi.apis.CancelInstallTaskV2Request;
import cn.openapi.apis.CancelInstallTaskV2Response;
import cn.openapi.apis.CleanPXERequest;
import cn.openapi.apis.CleanPXEResponse;
import cn.openapi.apis.CloneBMCTypeRequest;
import cn.openapi.apis.CloneBMCTypeResponse;
import cn.openapi.apis.CloneKickstartTemplateRequest;
import cn.openapi.apis.CloneKickstartTemplateResponse;
import cn.openapi.apis.ClonePartitionTemplateRequest;
import cn.openapi.apis.ClonePartitionTemplateResponse;
import cn.openapi.apis.CloseKVMSessionV2Request;
import cn.openapi.apis.CloseKVMSessionV2Response;
import cn.openapi.apis.CreateBMCTypeRequest;
import cn.openapi.apis.CreateBMCTypeResponse;
import cn.openapi.apis.CreateInstallProfileRequest;
import cn.openapi.apis.CreateInstallProfileResponse;
import cn.openapi.apis.CreateInstallTaskV2Request;
import cn.openapi.apis.CreateInstallTaskV2Response;
import cn.openapi.apis.CreateKVMSessionV2Request;
import cn.openapi.apis.CreateKVMSessionV2Response;
import cn.openapi.apis.CreateKickstartTemplateRequest;
import cn.openapi.apis.CreateKickstartTemplateResponse;
import cn.openapi.apis.CreateOSMediaV2Request;
import cn.openapi.apis.CreateOSMediaV2Response;
import cn.openapi.apis.CreatePMV2Request;
import cn.openapi.apis.CreatePMV2Response;
import cn.openapi.apis.CreatePartitionTemplateRequest;
import cn.openapi.apis.CreatePartitionTemplateResponse;
import cn.openapi.apis.DeleteBMCTypeRequest;
import cn.openapi.apis.DeleteBMCTypeResponse;
import cn.openapi.apis.DeleteInstallProfileRequest;
import cn.openapi.apis.DeleteInstallProfileResponse;
import cn.openapi.apis.DeleteInstallTaskV2Request;
import cn.openapi.apis.DeleteInstallTaskV2Response;
import cn.openapi.apis.DeleteKickstartTemplateRequest;
import cn.openapi.apis.DeleteKickstartTemplateResponse;
import cn.openapi.apis.DeleteOSMediaV2Request;
import cn.openapi.apis.DeleteOSMediaV2Response;
import cn.openapi.apis.DeletePMV2Request;
import cn.openapi.apis.DeletePMV2Response;
import cn.openapi.apis.DeletePartitionTemplateRequest;
import cn.openapi.apis.DeletePartitionTemplateResponse;
import cn.openapi.apis.DetectBMCTypeV2Request;
import cn.openapi.apis.DetectBMCTypeV2Response;
import cn.openapi.apis.DiscoverDHCPServersRequest;
import cn.openapi.apis.DiscoverDHCPServersResponse;
import cn.openapi.apis.DiscoverPMHardwareV2Request;
import cn.openapi.apis.DiscoverPMHardwareV2Response;
import cn.openapi.apis.GetBMCTypeRequest;
import cn.openapi.apis.GetBMCTypeResponse;
import cn.openapi.apis.GetDHCPNetworkRequest;
import cn.openapi.apis.GetDHCPNetworkResponse;
import cn.openapi.apis.GetDHCPServerStateRequest;
import cn.openapi.apis.GetDHCPServerStateResponse;
import cn.openapi.apis.GetInstallLogsV2Request;
import cn.openapi.apis.GetInstallLogsV2Response;
import cn.openapi.apis.GetInstallStatusByTaskIDV2Request;
import cn.openapi.apis.GetInstallStatusByTaskIDV2Response;
import cn.openapi.apis.GetInstallTaskV2Request;
import cn.openapi.apis.GetInstallTaskV2Response;
import cn.openapi.apis.GetKickstartTemplateRequest;
import cn.openapi.apis.GetKickstartTemplateResponse;
import cn.openapi.apis.GetLatestInstallConfigRequest;
import cn.openapi.apis.GetLatestInstallConfigResponse;
import cn.openapi.apis.GetOSMediaV2Request;
import cn.openapi.apis.GetOSMediaV2Response;
import cn.openapi.apis.GetPMHardwareV2Request;
import cn.openapi.apis.GetPMHardwareV2Response;
import cn.openapi.apis.GetPMJNLPFileV2Request;
import cn.openapi.apis.GetPMJNLPFileV2Response;
import cn.openapi.apis.GetPMPowerStatusV2Request;
import cn.openapi.apis.GetPMPowerStatusV2Response;
import cn.openapi.apis.GetPartitionTemplateRequest;
import cn.openapi.apis.GetPartitionTemplateResponse;
import cn.openapi.apis.ListBMCTypesRequest;
import cn.openapi.apis.ListBMCTypesResponse;
import cn.openapi.apis.ListInstallProfilesRequest;
import cn.openapi.apis.ListInstallProfilesResponse;
import cn.openapi.apis.ListInstallTasksV2Request;
import cn.openapi.apis.ListInstallTasksV2Response;
import cn.openapi.apis.ListKVMSessionsV2Request;
import cn.openapi.apis.ListKVMSessionsV2Response;
import cn.openapi.apis.ListKickstartTemplatesRequest;
import cn.openapi.apis.ListKickstartTemplatesResponse;
import cn.openapi.apis.ListOSMediaV2Request;
import cn.openapi.apis.ListOSMediaV2Response;
import cn.openapi.apis.ListPMV2Request;
import cn.openapi.apis.ListPMV2Response;
import cn.openapi.apis.ListPartitionTemplatesRequest;
import cn.openapi.apis.ListPartitionTemplatesResponse;
import cn.openapi.apis.PowerControlPMV2Request;
import cn.openapi.apis.PowerControlPMV2Response;
import cn.openapi.apis.PreviewKickstartCommandsRequest;
import cn.openapi.apis.PreviewKickstartCommandsResponse;
import cn.openapi.apis.PreviewKickstartTemplateRequest;
import cn.openapi.apis.PreviewKickstartTemplateResponse;
import cn.openapi.apis.RecyclePMRequest;
import cn.openapi.apis.RecyclePMResponse;
import cn.openapi.apis.RetryInstallTaskV2Request;
import cn.openapi.apis.RetryInstallTaskV2Response;
import cn.openapi.apis.SetDHCPNetworkRequest;
import cn.openapi.apis.SetDHCPNetworkResponse;
import cn.openapi.apis.SetDefaultPartitionTemplateRequest;
import cn.openapi.apis.SetDefaultPartitionTemplateResponse;
import cn.openapi.apis.TestBMCTypeRequest;
import cn.openapi.apis.TestBMCTypeResponse;
import cn.openapi.apis.TestPMIPMIV2Request;
import cn.openapi.apis.TestPMIPMIV2Response;
import cn.openapi.apis.UpdateBMCTypeRequest;
import cn.openapi.apis.UpdateBMCTypeResponse;
import cn.openapi.apis.UpdateInstallProfileRequest;
import cn.openapi.apis.UpdateInstallProfileResponse;
import cn.openapi.apis.UpdateKickstartTemplateRequest;
import cn.openapi.apis.UpdateKickstartTemplateResponse;
import cn.openapi.apis.UpdatePMV2Request;
import cn.openapi.apis.UpdatePMV2Response;
import cn.openapi.apis.UpdatePartitionTemplateRequest;
import cn.openapi.apis.UpdatePartitionTemplateResponse;
import cn.openapi.apis.ValidateKickstartTemplateRequest;
import cn.openapi.apis.ValidateKickstartTemplateResponse;
import cn.openapi.apis.ValidatePartitionConfigRequest;
import cn.openapi.apis.ValidatePartitionConfigResponse;
import cn.openapi.apis.CreateMemberTagRequest;
import cn.openapi.apis.CreateMemberTagResponse;
import cn.openapi.apis.CreateProjectRequest;
import cn.openapi.apis.CreateProjectResponse;
import cn.openapi.apis.CreateRoleRequest;
import cn.openapi.apis.CreateRoleResponse;
import cn.openapi.apis.DeleteMemberTagRequest;
import cn.openapi.apis.DeleteMemberTagResponse;
import cn.openapi.apis.DeleteProjectRequest;
import cn.openapi.apis.DeleteProjectResponse;
import cn.openapi.apis.DeleteRoleRequest;
import cn.openapi.apis.DeleteRoleResponse;
import cn.openapi.apis.DescribeProductRequest;
import cn.openapi.apis.DescribeProductResponse;
import cn.openapi.apis.DisableCompanyProductTypeRequest;
import cn.openapi.apis.DisableCompanyProductTypeResponse;
import cn.openapi.apis.EnableCompanyProductTypeRequest;
import cn.openapi.apis.EnableCompanyProductTypeResponse;
import cn.openapi.apis.GetProjectRequest;
import cn.openapi.apis.GetProjectResponse;
import cn.openapi.apis.GetRoleRequest;
import cn.openapi.apis.GetRoleResponse;
import cn.openapi.apis.ListMemberTagsRequest;
import cn.openapi.apis.ListMemberTagsResponse;
import cn.openapi.apis.ListProductPermissionsRequest;
import cn.openapi.apis.ListProductPermissionsResponse;
import cn.openapi.apis.ListProductResourcesRequest;
import cn.openapi.apis.ListProductResourcesResponse;
import cn.openapi.apis.ListProductTypeCompanysRequest;
import cn.openapi.apis.ListProductTypeCompanysResponse;
import cn.openapi.apis.ListProjectsRequest;
import cn.openapi.apis.ListProjectsResponse;
import cn.openapi.apis.ListRolesRequest;
import cn.openapi.apis.ListRolesResponse;
import cn.openapi.apis.MoveProjectResourceRequest;
import cn.openapi.apis.MoveProjectResourceResponse;
import cn.openapi.apis.RenameProjectRequest;
import cn.openapi.apis.RenameProjectResponse;
import cn.openapi.apis.RenameRoleRequest;
import cn.openapi.apis.RenameRoleResponse;
import cn.openapi.apis.UpdateRolePermissionRequest;
import cn.openapi.apis.UpdateRolePermissionResponse;
import cn.openapi.apis.DescribeRecycledResourceRequest;
import cn.openapi.apis.DescribeRecycledResourceResponse;
import cn.openapi.apis.RollbackResourceRequest;
import cn.openapi.apis.RollbackResourceResponse;
import cn.openapi.apis.TerminateResourceRequest;
import cn.openapi.apis.TerminateResourceResponse;
import cn.openapi.apis.AllocateRedisConsoleSessionRequest;
import cn.openapi.apis.AllocateRedisConsoleSessionResponse;
import cn.openapi.apis.ApplyRedisConfigFileRequest;
import cn.openapi.apis.ApplyRedisConfigFileResponse;
import cn.openapi.apis.CreateRedisRequest;
import cn.openapi.apis.CreateRedisResponse;
import cn.openapi.apis.CreateRedisConfigFileRequest;
import cn.openapi.apis.CreateRedisConfigFileResponse;
import cn.openapi.apis.CreateSlaveRedisRequest;
import cn.openapi.apis.CreateSlaveRedisResponse;
import cn.openapi.apis.DeleteRedisRequest;
import cn.openapi.apis.DeleteRedisResponse;
import cn.openapi.apis.DeleteRedisConfigFileRequest;
import cn.openapi.apis.DeleteRedisConfigFileResponse;
import cn.openapi.apis.DescribeRedisRequest;
import cn.openapi.apis.DescribeRedisResponse;
import cn.openapi.apis.DescribeRedisConfigFileRequest;
import cn.openapi.apis.DescribeRedisConfigFileResponse;
import cn.openapi.apis.DescribeRedisConfigParamsRequest;
import cn.openapi.apis.DescribeRedisConfigParamsResponse;
import cn.openapi.apis.DescribeRedisSlowlogRequest;
import cn.openapi.apis.DescribeRedisSlowlogResponse;
import cn.openapi.apis.DowngradeRedisRequest;
import cn.openapi.apis.DowngradeRedisResponse;
import cn.openapi.apis.FlushRedisRequest;
import cn.openapi.apis.FlushRedisResponse;
import cn.openapi.apis.GetRedisPriceRequest;
import cn.openapi.apis.GetRedisPriceResponse;
import cn.openapi.apis.UpdateRedisConfigParamsRequest;
import cn.openapi.apis.UpdateRedisConfigParamsResponse;
import cn.openapi.apis.UpdateRedisPasswordRequest;
import cn.openapi.apis.UpdateRedisPasswordResponse;
import cn.openapi.apis.UpgradeRedisRequest;
import cn.openapi.apis.UpgradeRedisResponse;
import cn.openapi.apis.UpgradeRedisToHARequest;
import cn.openapi.apis.UpgradeRedisToHAResponse;
import cn.openapi.apis.AddRegionRequest;
import cn.openapi.apis.AddRegionResponse;
import cn.openapi.apis.DescribeRegionRequest;
import cn.openapi.apis.DescribeRegionResponse;
import cn.openapi.apis.ModifyNameAndRemarkRequest;
import cn.openapi.apis.ModifyNameAndRemarkResponse;
import cn.openapi.apis.UpdateAdminRegionRequest;
import cn.openapi.apis.UpdateAdminRegionResponse;
import cn.openapi.apis.UpdateCompanyRegionRequest;
import cn.openapi.apis.UpdateCompanyRegionResponse;
import cn.openapi.apis.UpdateRegionRequest;
import cn.openapi.apis.UpdateRegionResponse;
import cn.openapi.apis.CreateResourceFromTemplateRequest;
import cn.openapi.apis.CreateResourceFromTemplateResponse;
import cn.openapi.apis.CreateResourceTemplateRequest;
import cn.openapi.apis.CreateResourceTemplateResponse;
import cn.openapi.apis.DeleteResourceTemplateRequest;
import cn.openapi.apis.DeleteResourceTemplateResponse;
import cn.openapi.apis.DescribeResourceTemplateRequest;
import cn.openapi.apis.DescribeResourceTemplateResponse;
import cn.openapi.apis.UpdateResourceTemplateRequest;
import cn.openapi.apis.UpdateResourceTemplateResponse;
import cn.openapi.apis.S3LoginRequest;
import cn.openapi.apis.S3LoginResponse;
import cn.openapi.apis.CreateDirectConnectRequest;
import cn.openapi.apis.CreateDirectConnectResponse;
import cn.openapi.apis.CreateSegmentRequest;
import cn.openapi.apis.CreateSegmentResponse;
import cn.openapi.apis.CreateSegmentRouteRequest;
import cn.openapi.apis.CreateSegmentRouteResponse;
import cn.openapi.apis.DeleteDirectConnectRequest;
import cn.openapi.apis.DeleteDirectConnectResponse;
import cn.openapi.apis.DeleteSegmentRequest;
import cn.openapi.apis.DeleteSegmentResponse;
import cn.openapi.apis.DeleteSegmentRouteRequest;
import cn.openapi.apis.DeleteSegmentRouteResponse;
import cn.openapi.apis.DescribeDirectConnectRequest;
import cn.openapi.apis.DescribeDirectConnectResponse;
import cn.openapi.apis.DescribeSegmentRequest;
import cn.openapi.apis.DescribeSegmentResponse;
import cn.openapi.apis.DescribeSegmentRouteRequest;
import cn.openapi.apis.DescribeSegmentRouteResponse;
import cn.openapi.apis.UpdateDirectConnectBandwidthRequest;
import cn.openapi.apis.UpdateDirectConnectBandwidthResponse;
import cn.openapi.apis.UpdateDirectConnectRemoteSubnetCIDRsRequest;
import cn.openapi.apis.UpdateDirectConnectRemoteSubnetCIDRsResponse;
import cn.openapi.apis.UpdateSegmentRequest;
import cn.openapi.apis.UpdateSegmentResponse;
import cn.openapi.apis.UpdateSegmentRouteRequest;
import cn.openapi.apis.UpdateSegmentRouteResponse;
import cn.openapi.apis.AliasSetRequest;
import cn.openapi.apis.AliasSetResponse;
import cn.openapi.apis.AliasStorageSetRequest;
import cn.openapi.apis.AliasStorageSetResponse;
import cn.openapi.apis.DescribeResourceUsersRequest;
import cn.openapi.apis.DescribeResourceUsersResponse;
import cn.openapi.apis.DescribeStorageSetRequest;
import cn.openapi.apis.DescribeStorageSetResponse;
import cn.openapi.apis.DescribeStorageSetSortPolicyRequest;
import cn.openapi.apis.DescribeStorageSetSortPolicyResponse;
import cn.openapi.apis.DescribeStorageTypeRequest;
import cn.openapi.apis.DescribeStorageTypeResponse;
import cn.openapi.apis.DescribeVMSetRequest;
import cn.openapi.apis.DescribeVMSetResponse;
import cn.openapi.apis.DescribeVMTypeRequest;
import cn.openapi.apis.DescribeVMTypeResponse;
import cn.openapi.apis.UpdateComputeSetCPUAllocationRatioRequest;
import cn.openapi.apis.UpdateComputeSetCPUAllocationRatioResponse;
import cn.openapi.apis.UpdateComputeSetCPUModelsRequest;
import cn.openapi.apis.UpdateComputeSetCPUModelsResponse;
import cn.openapi.apis.UpdateResourcePermissionRequest;
import cn.openapi.apis.UpdateResourcePermissionResponse;
import cn.openapi.apis.UpdateStorageSetSortPolicyRequest;
import cn.openapi.apis.UpdateStorageSetSortPolicyResponse;
import cn.openapi.apis.UpdateVMSetBoundImageRequest;
import cn.openapi.apis.UpdateVMSetBoundImageResponse;
import cn.openapi.apis.UpdateVMSetBoundStorageSetRequest;
import cn.openapi.apis.UpdateVMSetBoundStorageSetResponse;
import cn.openapi.apis.BindSecurityGroupRequest;
import cn.openapi.apis.BindSecurityGroupResponse;
import cn.openapi.apis.CreateIPGroupRequest;
import cn.openapi.apis.CreateIPGroupResponse;
import cn.openapi.apis.CreatePortGroupRequest;
import cn.openapi.apis.CreatePortGroupResponse;
import cn.openapi.apis.CreateSecurityGroupRequest;
import cn.openapi.apis.CreateSecurityGroupResponse;
import cn.openapi.apis.CreateSecurityGroupRuleRequest;
import cn.openapi.apis.CreateSecurityGroupRuleResponse;
import cn.openapi.apis.DeleteIPGroupRequest;
import cn.openapi.apis.DeleteIPGroupResponse;
import cn.openapi.apis.DeletePortGroupRequest;
import cn.openapi.apis.DeletePortGroupResponse;
import cn.openapi.apis.DeleteSecurityGroupRequest;
import cn.openapi.apis.DeleteSecurityGroupResponse;
import cn.openapi.apis.DeleteSecurityGroupRuleRequest;
import cn.openapi.apis.DeleteSecurityGroupRuleResponse;
import cn.openapi.apis.DescribeIPGroupRequest;
import cn.openapi.apis.DescribeIPGroupResponse;
import cn.openapi.apis.DescribePortGroupRequest;
import cn.openapi.apis.DescribePortGroupResponse;
import cn.openapi.apis.DescribeSecurityGroupRequest;
import cn.openapi.apis.DescribeSecurityGroupResponse;
import cn.openapi.apis.DescribeSecurityGroupResourceRequest;
import cn.openapi.apis.DescribeSecurityGroupResourceResponse;
import cn.openapi.apis.DescribeSecurityGroupRuleRequest;
import cn.openapi.apis.DescribeSecurityGroupRuleResponse;
import cn.openapi.apis.UnBindSecurityGroupRequest;
import cn.openapi.apis.UnBindSecurityGroupResponse;
import cn.openapi.apis.UpdateIPGroupRequest;
import cn.openapi.apis.UpdateIPGroupResponse;
import cn.openapi.apis.UpdatePortGroupRequest;
import cn.openapi.apis.UpdatePortGroupResponse;
import cn.openapi.apis.UpdateSecurityGroupRuleRequest;
import cn.openapi.apis.UpdateSecurityGroupRuleResponse;
import cn.openapi.apis.AllocateExternalStorageSetDiskRequest;
import cn.openapi.apis.AllocateExternalStorageSetDiskResponse;
import cn.openapi.apis.AttachExternalDiskRequest;
import cn.openapi.apis.AttachExternalDiskResponse;
import cn.openapi.apis.CreateExternalStorageSetRequest;
import cn.openapi.apis.CreateExternalStorageSetResponse;
import cn.openapi.apis.DeleteExternalStorageSetRequest;
import cn.openapi.apis.DeleteExternalStorageSetResponse;
import cn.openapi.apis.DescribeExternalDiskRequest;
import cn.openapi.apis.DescribeExternalDiskResponse;
import cn.openapi.apis.DescribeExternalStorageSetRequest;
import cn.openapi.apis.DescribeExternalStorageSetResponse;
import cn.openapi.apis.DescribeExternalStorageTypeRequest;
import cn.openapi.apis.DescribeExternalStorageTypeResponse;
import cn.openapi.apis.DetachExternalDiskRequest;
import cn.openapi.apis.DetachExternalDiskResponse;
import cn.openapi.apis.ScanFCSANRequest;
import cn.openapi.apis.ScanFCSANResponse;
import cn.openapi.apis.ScanISCSIDiskRequest;
import cn.openapi.apis.ScanISCSIDiskResponse;
import cn.openapi.apis.SetShareAbleExternalStorageRequest;
import cn.openapi.apis.SetShareAbleExternalStorageResponse;
import cn.openapi.apis.UpdateExternalStorageSetRequest;
import cn.openapi.apis.UpdateExternalStorageSetResponse;
import cn.openapi.apis.CompleteSMCRequest;
import cn.openapi.apis.CompleteSMCResponse;
import cn.openapi.apis.CreateSMCRequest;
import cn.openapi.apis.CreateSMCResponse;
import cn.openapi.apis.DeleteSMCRequest;
import cn.openapi.apis.DeleteSMCResponse;
import cn.openapi.apis.DescribeSMCRequest;
import cn.openapi.apis.DescribeSMCResponse;
import cn.openapi.apis.SMCHeartbeatRequest;
import cn.openapi.apis.SMCHeartbeatResponse;
import cn.openapi.apis.SetupSMCRequest;
import cn.openapi.apis.SetupSMCResponse;
import cn.openapi.apis.StartSMCRequest;
import cn.openapi.apis.StartSMCResponse;
import cn.openapi.apis.StopSMCRequest;
import cn.openapi.apis.StopSMCResponse;
import cn.openapi.apis.BindTagRequest;
import cn.openapi.apis.BindTagResponse;
import cn.openapi.apis.CreateTagRequest;
import cn.openapi.apis.CreateTagResponse;
import cn.openapi.apis.DeleteTagRequest;
import cn.openapi.apis.DeleteTagResponse;
import cn.openapi.apis.DescribeBindableTagResourceRequest;
import cn.openapi.apis.DescribeBindableTagResourceResponse;
import cn.openapi.apis.DescribeTagRequest;
import cn.openapi.apis.DescribeTagResponse;
import cn.openapi.apis.DescribeTagResourceRequest;
import cn.openapi.apis.DescribeTagResourceResponse;
import cn.openapi.apis.SetResourceTagsRequest;
import cn.openapi.apis.SetResourceTagsResponse;
import cn.openapi.apis.UnBindTagRequest;
import cn.openapi.apis.UnBindTagResponse;
import cn.openapi.apis.CreateTimerRequest;
import cn.openapi.apis.CreateTimerResponse;
import cn.openapi.apis.DeleteTimerRequest;
import cn.openapi.apis.DeleteTimerResponse;
import cn.openapi.apis.DescribeTimerRequest;
import cn.openapi.apis.DescribeTimerResponse;
import cn.openapi.apis.DescribeTimerTaskRequest;
import cn.openapi.apis.DescribeTimerTaskResponse;
import cn.openapi.apis.UpdateTimerRequest;
import cn.openapi.apis.UpdateTimerResponse;
import cn.openapi.apis.CreateTrafficMirrorRequest;
import cn.openapi.apis.CreateTrafficMirrorResponse;
import cn.openapi.apis.DeleteTrafficMirrorRequest;
import cn.openapi.apis.DeleteTrafficMirrorResponse;
import cn.openapi.apis.DescribeTrafficMirrorRequest;
import cn.openapi.apis.DescribeTrafficMirrorResponse;
import cn.openapi.apis.DescribeTrafficMirrorSourcesRequest;
import cn.openapi.apis.DescribeTrafficMirrorSourcesResponse;
import cn.openapi.apis.UpdateTrafficMirrorRequest;
import cn.openapi.apis.UpdateTrafficMirrorResponse;
import cn.openapi.apis.UpdateTrafficMirrorEnableRequest;
import cn.openapi.apis.UpdateTrafficMirrorEnableResponse;
import cn.openapi.apis.UpdateTrafficMirrorRuleRequest;
import cn.openapi.apis.UpdateTrafficMirrorRuleResponse;
import cn.openapi.apis.UpdateTrafficMirrorSourcesRequest;
import cn.openapi.apis.UpdateTrafficMirrorSourcesResponse;
import cn.openapi.apis.AllocateUSBRequest;
import cn.openapi.apis.AllocateUSBResponse;
import cn.openapi.apis.AttachUSBRequest;
import cn.openapi.apis.AttachUSBResponse;
import cn.openapi.apis.DetachUSBRequest;
import cn.openapi.apis.DetachUSBResponse;
import cn.openapi.apis.ListUSBsRequest;
import cn.openapi.apis.ListUSBsResponse;
import cn.openapi.apis.AllocateVIPRequest;
import cn.openapi.apis.AllocateVIPResponse;
import cn.openapi.apis.DescribeVIPRequest;
import cn.openapi.apis.DescribeVIPResponse;
import cn.openapi.apis.GetVIPDiffPriceRequest;
import cn.openapi.apis.GetVIPDiffPriceResponse;
import cn.openapi.apis.GetVIPPriceRequest;
import cn.openapi.apis.GetVIPPriceResponse;
import cn.openapi.apis.ReleaseVIPRequest;
import cn.openapi.apis.ReleaseVIPResponse;
import cn.openapi.apis.UpdateVIPBandwidthRequest;
import cn.openapi.apis.UpdateVIPBandwidthResponse;
import cn.openapi.apis.UpdateVIPBindResourceRequest;
import cn.openapi.apis.UpdateVIPBindResourceResponse;
import cn.openapi.apis.AbortMigrateVMDiskRequest;
import cn.openapi.apis.AbortMigrateVMDiskResponse;
import cn.openapi.apis.AbortVMSnapshotRequest;
import cn.openapi.apis.AbortVMSnapshotResponse;
import cn.openapi.apis.AddVMDiskRequest;
import cn.openapi.apis.AddVMDiskResponse;
import cn.openapi.apis.AddVMNICRequest;
import cn.openapi.apis.AddVMNICResponse;
import cn.openapi.apis.AllocateVMSSHSessionRequest;
import cn.openapi.apis.AllocateVMSSHSessionResponse;
import cn.openapi.apis.AllocateVMVNCSessionRequest;
import cn.openapi.apis.AllocateVMVNCSessionResponse;
import cn.openapi.apis.CancelCloneVMInstanceRequest;
import cn.openapi.apis.CancelCloneVMInstanceResponse;
import cn.openapi.apis.CloneVMInstanceRequest;
import cn.openapi.apis.CloneVMInstanceResponse;
import cn.openapi.apis.CreateVMInstanceRequest;
import cn.openapi.apis.CreateVMInstanceResponse;
import cn.openapi.apis.DeleteVMCRequest;
import cn.openapi.apis.DeleteVMCResponse;
import cn.openapi.apis.DeleteVMInstanceRequest;
import cn.openapi.apis.DeleteVMInstanceResponse;
import cn.openapi.apis.DeleteVMNICRequest;
import cn.openapi.apis.DeleteVMNICResponse;
import cn.openapi.apis.DeleteVMSnapshotRequest;
import cn.openapi.apis.DeleteVMSnapshotResponse;
import cn.openapi.apis.DescribeCIStatusRequest;
import cn.openapi.apis.DescribeCIStatusResponse;
import cn.openapi.apis.DescribeVMCRequest;
import cn.openapi.apis.DescribeVMCResponse;
import cn.openapi.apis.DescribeVMInstanceRequest;
import cn.openapi.apis.DescribeVMInstanceResponse;
import cn.openapi.apis.DescribeVMWareVMsRequest;
import cn.openapi.apis.DescribeVMWareVMsResponse;
import cn.openapi.apis.GenerateVMWareConsoleTicketRequest;
import cn.openapi.apis.GenerateVMWareConsoleTicketResponse;
import cn.openapi.apis.GetPaymentOfPremiumRequest;
import cn.openapi.apis.GetPaymentOfPremiumResponse;
import cn.openapi.apis.GetVMInstancePriceRequest;
import cn.openapi.apis.GetVMInstancePriceResponse;
import cn.openapi.apis.GetVMScreenshotRequest;
import cn.openapi.apis.GetVMScreenshotResponse;
import cn.openapi.apis.GetVMSpiceInfoRequest;
import cn.openapi.apis.GetVMSpiceInfoResponse;
import cn.openapi.apis.GetVMVNCInfoRequest;
import cn.openapi.apis.GetVMVNCInfoResponse;
import cn.openapi.apis.GetVMWareClusterDatastoreRequest;
import cn.openapi.apis.GetVMWareClusterDatastoreResponse;
import cn.openapi.apis.MigrateMgrVMStorageRequest;
import cn.openapi.apis.MigrateMgrVMStorageResponse;
import cn.openapi.apis.MigrateStorageBandWidthRequest;
import cn.openapi.apis.MigrateStorageBandWidthResponse;
import cn.openapi.apis.MigrateVMStorageRequest;
import cn.openapi.apis.MigrateVMStorageResponse;
import cn.openapi.apis.PoweroffVMInstanceRequest;
import cn.openapi.apis.PoweroffVMInstanceResponse;
import cn.openapi.apis.ReinstallVMInstanceRequest;
import cn.openapi.apis.ReinstallVMInstanceResponse;
import cn.openapi.apis.ResetVMInstancePasswordRequest;
import cn.openapi.apis.ResetVMInstancePasswordResponse;
import cn.openapi.apis.ResetVMNetConfigRequest;
import cn.openapi.apis.ResetVMNetConfigResponse;
import cn.openapi.apis.ResizeVMConfigRequest;
import cn.openapi.apis.ResizeVMConfigResponse;
import cn.openapi.apis.RestartVMInstanceRequest;
import cn.openapi.apis.RestartVMInstanceResponse;
import cn.openapi.apis.RestoreVMInstanceRequest;
import cn.openapi.apis.RestoreVMInstanceResponse;
import cn.openapi.apis.SaveVMInstanceRequest;
import cn.openapi.apis.SaveVMInstanceResponse;
import cn.openapi.apis.SetBootFromCdromRequest;
import cn.openapi.apis.SetBootFromCdromResponse;
import cn.openapi.apis.StartVMInstanceRequest;
import cn.openapi.apis.StartVMInstanceResponse;
import cn.openapi.apis.StopVMInstanceRequest;
import cn.openapi.apis.StopVMInstanceResponse;
import cn.openapi.apis.UnSetBootFromCdromRequest;
import cn.openapi.apis.UnSetBootFromCdromResponse;
import cn.openapi.apis.UpdateVMAdvancedOptionsRequest;
import cn.openapi.apis.UpdateVMAdvancedOptionsResponse;
import cn.openapi.apis.UpdateVMBootBootLoaderTypeRequest;
import cn.openapi.apis.UpdateVMBootBootLoaderTypeResponse;
import cn.openapi.apis.UpdateVMBootDevicesRequest;
import cn.openapi.apis.UpdateVMBootDevicesResponse;
import cn.openapi.apis.UpdateVMCPUHypervisorRequest;
import cn.openapi.apis.UpdateVMCPUHypervisorResponse;
import cn.openapi.apis.UpdateVMCPULimitPercentRequest;
import cn.openapi.apis.UpdateVMCPULimitPercentResponse;
import cn.openapi.apis.UpdateVMCPUModelRequest;
import cn.openapi.apis.UpdateVMCPUModelResponse;
import cn.openapi.apis.UpdateVMCPUPriorityRequest;
import cn.openapi.apis.UpdateVMCPUPriorityResponse;
import cn.openapi.apis.UpdateVMDNSRequest;
import cn.openapi.apis.UpdateVMDNSResponse;
import cn.openapi.apis.UpdateVMDefaultGWRequest;
import cn.openapi.apis.UpdateVMDefaultGWResponse;
import cn.openapi.apis.UpdateVMDiskBusRequest;
import cn.openapi.apis.UpdateVMDiskBusResponse;
import cn.openapi.apis.UpdateVMDiskCacheModeRequest;
import cn.openapi.apis.UpdateVMDiskCacheModeResponse;
import cn.openapi.apis.UpdateVMHighAvailabilityRequest;
import cn.openapi.apis.UpdateVMHighAvailabilityResponse;
import cn.openapi.apis.UpdateVMISOSlotRequest;
import cn.openapi.apis.UpdateVMISOSlotResponse;
import cn.openapi.apis.UpdateVMMACRequest;
import cn.openapi.apis.UpdateVMMACResponse;
import cn.openapi.apis.UpdateVMNICLinkStateRequest;
import cn.openapi.apis.UpdateVMNICLinkStateResponse;
import cn.openapi.apis.UpdateVMNICModelRequest;
import cn.openapi.apis.UpdateVMNICModelResponse;
import cn.openapi.apis.UpdateVMNICQueuesRequest;
import cn.openapi.apis.UpdateVMNICQueuesResponse;
import cn.openapi.apis.UpdateVMOSRequest;
import cn.openapi.apis.UpdateVMOSResponse;
import cn.openapi.apis.UpdateVMSupportHotPlugRequest;
import cn.openapi.apis.UpdateVMSupportHotPlugResponse;
import cn.openapi.apis.UpdateVMUserDataRequest;
import cn.openapi.apis.UpdateVMUserDataResponse;
import cn.openapi.apis.UpdateVMVCPUBindingRequest;
import cn.openapi.apis.UpdateVMVCPUBindingResponse;
import cn.openapi.apis.AssociateVPCPeeringRequest;
import cn.openapi.apis.AssociateVPCPeeringResponse;
import cn.openapi.apis.CreateSubnetRequest;
import cn.openapi.apis.CreateSubnetResponse;
import cn.openapi.apis.CreateSubnetRouteRequest;
import cn.openapi.apis.CreateSubnetRouteResponse;
import cn.openapi.apis.CreateVPCRequest;
import cn.openapi.apis.CreateVPCResponse;
import cn.openapi.apis.DeleteSubnetRequest;
import cn.openapi.apis.DeleteSubnetResponse;
import cn.openapi.apis.DeleteSubnetRouteRequest;
import cn.openapi.apis.DeleteSubnetRouteResponse;
import cn.openapi.apis.DeleteVPCRequest;
import cn.openapi.apis.DeleteVPCResponse;
import cn.openapi.apis.DescribeSubnetRequest;
import cn.openapi.apis.DescribeSubnetResponse;
import cn.openapi.apis.DescribeSubnetRouteRequest;
import cn.openapi.apis.DescribeSubnetRouteResponse;
import cn.openapi.apis.DescribeVPCRequest;
import cn.openapi.apis.DescribeVPCResponse;
import cn.openapi.apis.DissociateVPCPeeringRequest;
import cn.openapi.apis.DissociateVPCPeeringResponse;
import cn.openapi.apis.GetSubnetAvailableIPQuotaRequest;
import cn.openapi.apis.GetSubnetAvailableIPQuotaResponse;
import cn.openapi.apis.ListAllocatedIPsInSubnetRequest;
import cn.openapi.apis.ListAllocatedIPsInSubnetResponse;
import cn.openapi.apis.ReplaceIPRequest;
import cn.openapi.apis.ReplaceIPResponse;
import cn.openapi.apis.UpdateSubnetRouteRequest;
import cn.openapi.apis.UpdateSubnetRouteResponse;
import cn.openapi.apis.BindEIPToVPNRequest;
import cn.openapi.apis.BindEIPToVPNResponse;
import cn.openapi.apis.CreateRemoteVPNGWRequest;
import cn.openapi.apis.CreateRemoteVPNGWResponse;
import cn.openapi.apis.CreateVPNGWRequest;
import cn.openapi.apis.CreateVPNGWResponse;
import cn.openapi.apis.CreateVPNTunnelRequest;
import cn.openapi.apis.CreateVPNTunnelResponse;
import cn.openapi.apis.DeleteRemoteVPNGWRequest;
import cn.openapi.apis.DeleteRemoteVPNGWResponse;
import cn.openapi.apis.DeleteVPNGWRequest;
import cn.openapi.apis.DeleteVPNGWResponse;
import cn.openapi.apis.DeleteVPNTunnelRequest;
import cn.openapi.apis.DeleteVPNTunnelResponse;
import cn.openapi.apis.DescribeRemoteVPNGWRequest;
import cn.openapi.apis.DescribeRemoteVPNGWResponse;
import cn.openapi.apis.DescribeVPNGWRequest;
import cn.openapi.apis.DescribeVPNGWResponse;
import cn.openapi.apis.DescribeVPNTunnelRequest;
import cn.openapi.apis.DescribeVPNTunnelResponse;
import cn.openapi.apis.GetPriceRequest;
import cn.openapi.apis.GetPriceResponse;
import cn.openapi.apis.GetVPNTunnelConfigRequest;
import cn.openapi.apis.GetVPNTunnelConfigResponse;
import cn.openapi.apis.UnbindEIPFromVPNRequest;
import cn.openapi.apis.UnbindEIPFromVPNResponse;
import cn.openapi.apis.UpdateVPNTunnelRequest;
import cn.openapi.apis.UpdateVPNTunnelResponse;
import cn.openapi.apis.UpgradeVPNGWToHARequest;
import cn.openapi.apis.UpgradeVPNGWToHAResponse;
import cn.openapi.apis.CreateWorkflowRequest;
import cn.openapi.apis.CreateWorkflowResponse;
import cn.openapi.apis.DeleteWorkflowRequest;
import cn.openapi.apis.DeleteWorkflowResponse;
import cn.openapi.apis.DescribeApplicationRequest;
import cn.openapi.apis.DescribeApplicationResponse;
import cn.openapi.apis.DescribeApplicationNodeRequest;
import cn.openapi.apis.DescribeApplicationNodeResponse;
import cn.openapi.apis.DescribeWorkflowRequest;
import cn.openapi.apis.DescribeWorkflowResponse;
import cn.openapi.apis.UpdateApplicationNodeRequest;
import cn.openapi.apis.UpdateApplicationNodeResponse;
import cn.openapi.apis.UpdateWorkflowRequest;
import cn.openapi.apis.UpdateWorkflowResponse;


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
