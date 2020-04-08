package com.github.coderbuck.covid19;

import java.util.List;

public class AreaData {

    private boolean success;
    private List<ResultsBean> results;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {

        private int locationId;
        private String continentName;
        private String continentEnglishName;
        private String countryName;
        private String countryEnglishName;
        private String provinceName;
        private String provinceShortName;
        private String provinceEnglishName;
        private int currentConfirmedCount;
        private int confirmedCount;
        private int suspectedCount;
        private int curedCount;
        private int deadCount;
        private String comment;
        private long updateTime;
        private List<CitiesBean> cities;

        public int getLocationId() {
            return locationId;
        }

        public void setLocationId(int locationId) {
            this.locationId = locationId;
        }

        public String getContinentName() {
            return continentName;
        }

        public void setContinentName(String continentName) {
            this.continentName = continentName;
        }

        public String getContinentEnglishName() {
            return continentEnglishName;
        }

        public void setContinentEnglishName(String continentEnglishName) {
            this.continentEnglishName = continentEnglishName;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCountryEnglishName() {
            return countryEnglishName;
        }

        public void setCountryEnglishName(String countryEnglishName) {
            this.countryEnglishName = countryEnglishName;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public String getProvinceShortName() {
            return provinceShortName;
        }

        public void setProvinceShortName(String provinceShortName) {
            this.provinceShortName = provinceShortName;
        }

        public String getProvinceEnglishName() {
            return provinceEnglishName;
        }

        public void setProvinceEnglishName(String provinceEnglishName) {
            this.provinceEnglishName = provinceEnglishName;
        }

        public int getCurrentConfirmedCount() {
            return currentConfirmedCount;
        }

        public void setCurrentConfirmedCount(int currentConfirmedCount) {
            this.currentConfirmedCount = currentConfirmedCount;
        }

        public int getConfirmedCount() {
            return confirmedCount;
        }

        public void setConfirmedCount(int confirmedCount) {
            this.confirmedCount = confirmedCount;
        }

        public int getSuspectedCount() {
            return suspectedCount;
        }

        public void setSuspectedCount(int suspectedCount) {
            this.suspectedCount = suspectedCount;
        }

        public int getCuredCount() {
            return curedCount;
        }

        public void setCuredCount(int curedCount) {
            this.curedCount = curedCount;
        }

        public int getDeadCount() {
            return deadCount;
        }

        public void setDeadCount(int deadCount) {
            this.deadCount = deadCount;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public List<CitiesBean> getCities() {
            return cities;
        }

        public void setCities(List<CitiesBean> cities) {
            this.cities = cities;
        }

        public static class CitiesBean {
            /**
             * cityName : 丽水
             * currentConfirmedCount : 10
             * confirmedCount : 28
             * suspectedCount : 0
             * curedCount : 18
             * deadCount : 0
             * locationId : 331100
             * cityEnglishName : Lishui
             */

            private String cityName;
            private int currentConfirmedCount;
            private int confirmedCount;
            private int suspectedCount;
            private int curedCount;
            private int deadCount;
            private int locationId;
            private String cityEnglishName;

            public String getCityName() {
                return cityName;
            }

            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            public int getCurrentConfirmedCount() {
                return currentConfirmedCount;
            }

            public void setCurrentConfirmedCount(int currentConfirmedCount) {
                this.currentConfirmedCount = currentConfirmedCount;
            }

            public int getConfirmedCount() {
                return confirmedCount;
            }

            public void setConfirmedCount(int confirmedCount) {
                this.confirmedCount = confirmedCount;
            }

            public int getSuspectedCount() {
                return suspectedCount;
            }

            public void setSuspectedCount(int suspectedCount) {
                this.suspectedCount = suspectedCount;
            }

            public int getCuredCount() {
                return curedCount;
            }

            public void setCuredCount(int curedCount) {
                this.curedCount = curedCount;
            }

            public int getDeadCount() {
                return deadCount;
            }

            public void setDeadCount(int deadCount) {
                this.deadCount = deadCount;
            }

            public int getLocationId() {
                return locationId;
            }

            public void setLocationId(int locationId) {
                this.locationId = locationId;
            }

            public String getCityEnglishName() {
                return cityEnglishName;
            }

            public void setCityEnglishName(String cityEnglishName) {
                this.cityEnglishName = cityEnglishName;
            }
        }
    }
}
